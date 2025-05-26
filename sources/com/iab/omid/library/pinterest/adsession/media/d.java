package com.iab.omid.library.pinterest.adsession.media;

/* loaded from: classes3.dex */
public enum d {
    PREROLL("preroll"),
    MIDROLL("midroll"),
    POSTROLL("postroll"),
    STANDALONE("standalone");

    private final String position;

    d(String str) {
        this.position = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.position;
    }
}
