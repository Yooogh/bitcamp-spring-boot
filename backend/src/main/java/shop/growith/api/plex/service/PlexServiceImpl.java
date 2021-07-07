package shop.growith.api.plex.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.growith.api.plex.domain.PlexDto;
import shop.growith.api.plex.repository.PlexRepository;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class PlexServiceImpl implements PlexService{

    private final PlexRepository plexRepository;
    @Override
    public int regPlex(PlexDto vo) {
        return 0;
    }

    @Override
    public PlexDto selectbyNo(int plexNo) {
        return null;
    }

    @Override
    public PlexDto selectByName(String name) {
        return null;
    }

    @Override
    public boolean isExist(int plexNo) {
        return false;
    }

    @Override
    public boolean isExistName(String name) {
        return false;
    }

    @Override
    public int delete(int plexNo) {
        return 0;
    }

    @Override
    public ArrayList<PlexDto> selectAll() {
        return null;
    }

    @Override
    public int update(PlexDto vo) {
        return 0;
    }
}