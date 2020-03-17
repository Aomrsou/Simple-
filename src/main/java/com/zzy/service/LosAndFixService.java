package com.zzy.service;

import com.zzy.model.dto.LosAndFixDTO;
import com.zzy.model.vo.LosAndFixVO;

import java.util.List;

public interface LosAndFixService {
    List<LosAndFixDTO> listLos(LosAndFixVO vo);
    List<LosAndFixDTO> listFix(LosAndFixVO vo);
    Boolean updateLos(LosAndFixVO vo);
    Boolean updateFix(LosAndFixVO vo);
    Boolean addLos(LosAndFixVO vo);
    Boolean addFix(LosAndFixVO vo);
    Boolean deleteLos(LosAndFixVO vo);
    Boolean deleteFix(LosAndFixVO vo);
}
