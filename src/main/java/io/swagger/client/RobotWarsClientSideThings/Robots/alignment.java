package io.swagger.client.RobotWarsClientSideThings.Robots;

public enum alignment {
    NORTH(0, -1, "W", "N"),
    NORTH_EAST(1, -1, "E", "NE"),
    EAST(1, 0, "D", "E"),
    SOUTH_EAST(1, 1, "X", "SE"),
    SOUTH(0, 1, "S", "S"),
    SOUTH_WEST(-1, 1, "Y", "SW"),
    WEST(-1, 0, "A", "W"),
    NORTH_WEST(-1, -1, "Q", "NW"),
    ;

    public final int x;
    public final int y;
    public final String key;
    public final String freddyKey;

    alignment(int x, int y, String key, String freddyKey) {
        this.x = x;
        this.y = y;
        this.key = key;
        this.freddyKey = freddyKey;
    }

}
