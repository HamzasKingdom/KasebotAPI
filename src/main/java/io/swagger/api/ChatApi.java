/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.5).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Message;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-12T16:03:36.994Z[GMT]")
@Api(value = "chat", description = "the chat API")
public interface ChatApi {

    @ApiOperation(value = "", nickname = "chatIdGet", notes = "Gets all previous messages of a conversation (by Customer id)", response = Message.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK conversation obtained", response = Message.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Error: Not Found") })
    @RequestMapping(value = "/chat/{id}",
        produces = { "applicaiton/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Message>> chatIdGet(@ApiParam(value = "The customer id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "", nickname = "submitMessage", notes = "Submits the message input by the customer.", response = Message.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK Message submitted", response = Message.class) })
    @RequestMapping(value = "/chat/sub",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Message> submitMessage(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Message body);

}
