package org.flightms.controller;

import java.math.BigInteger;
import java.util.List;

import org.flightms.model.Flight;
import org.flightms.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flightmanagementststem/flight")
public class FlightController {
	
	@Autowired
	private FlightService flightService;

	public FlightController(FlightService flightService) {
		super();
		this.flightService = flightService;
	}
	
	
//	Add data
	@PostMapping()
	public ResponseEntity<Flight> saveEmployee(@RequestBody Flight flight){
        return new ResponseEntity<Flight>
        (flightService.addFlight(flight), HttpStatus.CREATED);
    }
	
//	Modify data
	@PutMapping("{id}")
	public ResponseEntity<Flight> modifyFlight(@PathVariable("id") BigInteger id, @RequestBody
		Flight flight){
		return new ResponseEntity <Flight> (flightService.modifyFlight(flight, id),HttpStatus.OK);
	}
	
	
	//get single details
	@GetMapping("{id}")
	public Flight viewFlight(@PathVariable("id") BigInteger flightNumber) {
		return flightService.viewFlight(flightNumber);
	}
	
	@GetMapping
	public List<Flight> viewAllFlight(){
		return flightService.viewAllFlight();
	}
	//delete data
	@DeleteMapping("{id}")
    public ResponseEntity<String> deleteFlight(@PathVariable("id") BigInteger id)
    {
        //delete
        flightService.deleteFlight(id);
        return new ResponseEntity<String>("Flight deleted Successfully!",HttpStatus.OK);
    }
	

}
