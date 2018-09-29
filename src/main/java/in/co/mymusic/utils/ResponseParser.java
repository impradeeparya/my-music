package in.co.mymusic.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import in.co.mymusic.dto.MusicBrainzRelation;
import in.co.mymusic.dto.MusicBrainzResponse;

public class ResponseParser {

  private static ObjectMapper mapper = new ObjectMapper();

  private static Function<JsonNode, List<MusicBrainzRelation>> musicBrainzRelations =
      (jsonNode) -> {
        List<MusicBrainzRelation> relations;
        try {
          ObjectReader reader = mapper.readerFor(new TypeReference<MusicBrainzRelation>() {});
          relations = reader.readValue(jsonNode);
        } catch (IOException e) {
          e.printStackTrace();
          relations = Collections.emptyList();
        }
        return relations;
      };

  public static Function<JsonNode, MusicBrainzResponse> musicBrainz = (jsonNode) -> {

    MusicBrainzResponse musicBrainzResponse = new MusicBrainzResponse();

    jsonNode.fields().forEachRemaining(node -> {

      switch (node.getKey()) {
        case "type":
          musicBrainzResponse.setType(node.getValue().toString());
          break;
        case "sort_name":
          musicBrainzResponse.setSortName(node.getValue().toString());
          break;
        case "ipis":
          break;
        case "end_area":
          break;
        case "release-group":
          break;
        case "country":
          musicBrainzResponse.setCountry(node.getValue().toString());
          break;
        case "type-id":
          musicBrainzResponse.setTypeId(node.getValue().toString());
          break;
        case "gender-id":
          musicBrainzResponse.setGenderId(node.getValue().toString());
          break;
        case "area":
          break;
        case "disambiguation":
          musicBrainzResponse.setDisambiguation(node.getValue().toString());
          break;
        case "id":
          musicBrainzResponse.setId(node.getValue().toString());
          break;
        case "name":
          musicBrainzResponse.setName(node.getValue().toString());
          break;
        case "gender":
          musicBrainzResponse.setGender(node.getValue().toString());
          break;
        case "begin_area":
          break;
        case "isnis":
          break;
        case "relations":
          musicBrainzResponse.setRelations(musicBrainzRelations.apply(node.getValue()));
          break;
        case "life-span":
          break;
      }
    });

    return musicBrainzResponse;
  };
}
