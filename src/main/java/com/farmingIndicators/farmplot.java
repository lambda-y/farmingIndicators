package net.runelite.client.plugins.farmingIndicators;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.Getter;
import net.runelite.api.coords.WorldPoint;

class farmplot {

    farmplot(WorldPoint location){
        this.location = location;
        this.index = new ArrayList<>();
    }

    @Getter
    private final WorldPoint location;

    @Getter
    private final List<Integer> index;

    @Getter
    private boolean isFarmPlot;
}
