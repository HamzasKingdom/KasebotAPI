/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.5).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.AvgCaseDur;
import org.threeten.bp.LocalDate;
import io.swagger.model.Message;
import io.swagger.model.ModelCase;
import io.swagger.model.ResolOnUnresol;
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
@Api(value = "reports", description = "the reports API")
public interface ReportsApi {

    @ApiOperation(value = "", nickname = "reportsAvgCaseDurGet", notes = "gets the Average Case Duration Over Time", response = AvgCaseDur.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK Avg_case_dur report obtained", response = AvgCaseDur.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Error: Not Found") })
    @RequestMapping(value = "/reports/Avg_case_dur",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<AvgCaseDur> reportsAvgCaseDurGet();


    @ApiOperation(value = "", nickname = "reportsResolOnUnresolTimeGet", notes = "gets the Number of Cases Resolved/Unresolved Over Time", response = ResolOnUnresol.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK Resol_unresol_time report obtained", response = ResolOnUnresol.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Error: Not Found") })
    @RequestMapping(value = "/reports/Resol_on_unresol_time",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ResolOnUnresol> reportsResolOnUnresolTimeGet();


    @ApiOperation(value = "", nickname = "reportsSearchCaseGet", notes = "gets Cases by CaseID, CustomerID, First or Last Name, Date or Key-Word", response = ModelCase.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK Case(s) obtained", response = ModelCase.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Error: Not Found") })
    @RequestMapping(value = "/reports/Search_case",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<ModelCase>> reportsSearchCaseGet(@ApiParam(value = "") @Valid @RequestParam(value = "CaseID", required = false) Long caseID,@ApiParam(value = "") @Valid @RequestParam(value = "CustomerID", required = false) Long customerID,@ApiParam(value = "") @Valid @RequestParam(value = "firstName", required = false) String firstName,@ApiParam(value = "") @Valid @RequestParam(value = "lastName", required = false) String lastName,@ApiParam(value = "") @Valid @RequestParam(value = "date", required = false) LocalDate date,@ApiParam(value = "") @Valid @RequestParam(value = "keyWord", required = false) String keyWord);


    @ApiOperation(value = "", nickname = "reportsViewMessageCaseIdGet", notes = "Gets all previous messages of a conversation (by Case id)", response = Message.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK All messages associated with the case id", response = Message.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Error: Not Found") })
    @RequestMapping(value = "/reports/ViewMessage/{caseId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Message>> reportsViewMessageCaseIdGet(@ApiParam(value = "The case Id",required=true) @PathVariable("caseId") Long caseId);

}
