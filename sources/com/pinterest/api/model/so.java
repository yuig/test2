package com.pinterest.api.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0015\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\u0019\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\b\u0010\u0006\u0082\u0001\n\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/pinterest/api/model/so;", "", "", "a", "I", "c", "()I", "widthRatio", "b", "heightRatio", "<init>", "(II)V", "com/pinterest/api/model/ho", "com/pinterest/api/model/io", "com/pinterest/api/model/jo", "com/pinterest/api/model/ko", "com/pinterest/api/model/lo", "com/pinterest/api/model/mo", "com/pinterest/api/model/no", "com/pinterest/api/model/oo", "com/pinterest/api/model/po", "com/pinterest/api/model/qo", "com/pinterest/api/model/ro", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class so implements Comparable<so> {

    /* renamed from: c, reason: collision with root package name */
    public static final ho f41948c = new ho(null);

    /* renamed from: d, reason: collision with root package name */
    public static final Regex f41949d = new Regex("^(\\d+):(\\d+)$");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("widthRatio")
    private final int widthRatio;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("heightRatio")
    private final int heightRatio;

    public /* synthetic */ so(int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, i14);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(so other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return al2.a.b(Double.valueOf(d()), Double.valueOf(other.d()));
    }

    /* renamed from: b, reason: from getter */
    public final int getHeightRatio() {
        return this.heightRatio;
    }

    /* renamed from: c, reason: from getter */
    public final int getWidthRatio() {
        return this.widthRatio;
    }

    public final double d() {
        return this.widthRatio / this.heightRatio;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.d(getClass(), obj.getClass())) {
            return false;
        }
        so soVar = (so) obj;
        return this.widthRatio == soVar.widthRatio && this.heightRatio == soVar.heightRatio;
    }

    public final String toString() {
        return this.widthRatio + ":" + this.heightRatio;
    }

    private so(int i13, int i14) {
        this.widthRatio = i13;
        this.heightRatio = i14;
    }
}
