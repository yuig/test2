package net.quikkly.core;

import a.a;

/* loaded from: classes4.dex */
public class ScanResult {
    public static final int STATUS_UNKNOWN = 0;
    public int statusCode;
    public Tag[] tags;

    public ScanResult() {
        this(new Tag[0], 0);
    }

    public boolean isEmpty() {
        return this.tags.length <= 0;
    }

    public String toString() {
        return a.n(new StringBuilder("ScanResult with "), this.tags.length, " tags");
    }

    public ScanResult(Tag[] tagArr, int i13) {
        if (tagArr == null) {
            throw new IllegalArgumentException("tags array must not be null, make a zero-length array instead");
        }
        this.tags = tagArr;
        this.statusCode = i13;
    }
}
