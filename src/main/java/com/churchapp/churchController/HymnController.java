package com.churchapp.churchController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.churchapp.churchDao.HymnDao;
import com.churchapp.churchEntity.HymnEntity;

@Controller
@RequestMapping("/hymns")
public class HymnController {

	@Autowired
	HymnDao hymnDao;

	@RequestMapping(value = "/getHymnsByNumber", method = RequestMethod.POST)
	public HymnEntity getHymn(@RequestParam int hymnNumber) {
		HymnEntity hymn = hymnDao.getHymn(hymnNumber);
		return hymn;

	}

}
