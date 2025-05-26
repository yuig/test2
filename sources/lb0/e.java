package lb0;

/* loaded from: classes.dex */
public enum e {
    CACHE_FOLDER_JSON("json"),
    CACHE_FOLDER_PREFETCH("prefetch"),
    CACHE_FOLDER_OTHER("other"),
    CACHE_FOLDER_VIDEO("video"),
    CACHE_FOLDER_MUSIC("music"),
    CACHE_FOLDER_IMAGE("image");

    private final String value;

    e(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
