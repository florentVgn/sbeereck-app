package com.sbeereck.lutrampal.model;

public enum School {
    ENSE3,
    ENSIMAG,
    ESISAR, //lol
    GI,
    PAPET,
    PHELMA;

    public static School getSchool(String name) {
        if (name.equals("Ense3"))
            return ENSE3;
        if (name.equals("Ensimag"))
            return ENSIMAG;
        if (name.equals("Esisar"))
            return ESISAR;
        if (name.equals("GI"))
            return GI;
        if (name.equals("Papet"))
            return PAPET;
        return PHELMA;
    }

    @Override
    public String toString() {
        switch (this) {
            case ENSE3:
                return "Ense3";
            case ENSIMAG:
                return "Ensimag";
            case ESISAR:
                return "Esisar";
            case GI:
                return "GI";
            case PAPET:
                return "Papet";
            case PHELMA:
                return "Phelma";
            default:
                return "";
        }
    }
}
