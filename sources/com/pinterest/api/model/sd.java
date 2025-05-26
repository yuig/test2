package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class sd {

    /* renamed from: a, reason: collision with root package name */
    @om.b("media_type")
    private Integer f41854a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("sticker")
    private wd f41855b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f41856c;

    public /* synthetic */ sd(Integer num, wd wdVar, boolean[] zArr, int i13) {
        this(num, wdVar, zArr);
    }

    public final wd c() {
        return this.f41855b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        sd sdVar = (sd) obj;
        return Objects.equals(this.f41854a, sdVar.f41854a) && Objects.equals(this.f41855b, sdVar.f41855b);
    }

    public final int hashCode() {
        return Objects.hash(this.f41854a, this.f41855b);
    }

    public sd() {
        this.f41856c = new boolean[2];
    }

    private sd(Integer num, wd wdVar, boolean[] zArr) {
        this.f41854a = num;
        this.f41855b = wdVar;
        this.f41856c = zArr;
    }
}
