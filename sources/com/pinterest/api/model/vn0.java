package com.pinterest.api.model;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001$B5\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0019\u001a\u00020\u0012\u0012\u0006\u0010\u001d\u001a\u00020\n\u0012\u0006\u0010!\u001a\u00020\u0012¢\u0006\u0004\b\"\u0010#R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\"\u0010!\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018¨\u0006%"}, d2 = {"Lcom/pinterest/api/model/vn0;", "Lcom/pinterest/api/model/wx;", "Ldl1/s;", "", "Lcom/pinterest/api/model/bo0;", "a", "Ljava/util/List;", "l", "()Ljava/util/List;", "items", "", "b", "I", "s", "()I", "setStartMediaIndex", "(I)V", "startMediaIndex", "", "c", "J", "u", "()J", "setStartTimeMs", "(J)V", "startTimeMs", "d", "h", "setEndMediaIndex", "endMediaIndex", "e", "j", "setEndTimeMs", "endTimeMs", "<init>", "(Ljava/util/List;IJIJ)V", "com/pinterest/api/model/un0", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class vn0 extends wx {

    /* renamed from: f, reason: collision with root package name */
    public static final un0 f42926f = new un0(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("items")
    @NotNull
    private final List<bo0> items;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("startMediaIndex")
    private int startMediaIndex;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("startTimeMs")
    private long startTimeMs;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("endMediaIndex")
    private int endMediaIndex;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @om.b("endTimeMs")
    private long endTimeMs;

    public vn0(@NotNull List<bo0> items, int i13, long j13, int i14, long j14) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.startMediaIndex = i13;
        this.startTimeMs = j13;
        this.endMediaIndex = i14;
        this.endTimeMs = j14;
    }

    public static vn0 a(vn0 vn0Var, List list, int i13, long j13, int i14, long j14, int i15) {
        List items = (i15 & 1) != 0 ? vn0Var.items : list;
        int i16 = (i15 & 2) != 0 ? vn0Var.startMediaIndex : i13;
        long j15 = (i15 & 4) != 0 ? vn0Var.startTimeMs : j13;
        int i17 = (i15 & 8) != 0 ? vn0Var.endMediaIndex : i14;
        long j16 = (i15 & 16) != 0 ? vn0Var.endTimeMs : j14;
        vn0Var.getClass();
        Intrinsics.checkNotNullParameter(items, "items");
        return new vn0(items, i16, j15, i17, j16);
    }

    public final int B() {
        return this.items.size();
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return String.valueOf(hashCode());
    }

    public final bo0 e() {
        return (bo0) d7.b.F(this.items);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.d(vn0.class, obj.getClass())) {
            return false;
        }
        vn0 vn0Var = (vn0) obj;
        return this.startMediaIndex == vn0Var.startMediaIndex && this.startTimeMs == vn0Var.startTimeMs && this.endMediaIndex == vn0Var.endMediaIndex && this.endTimeMs == vn0Var.endTimeMs && Intrinsics.d(this.items, vn0Var.items);
    }

    public final int g() {
        return this.items.size();
    }

    /* renamed from: h, reason: from getter */
    public final int getEndMediaIndex() {
        return this.endMediaIndex;
    }

    public final int hashCode() {
        return Long.hashCode(this.endTimeMs) + ep.b.b(this.endMediaIndex, a.a.c(this.startTimeMs, ep.b.b(this.startMediaIndex, this.items.hashCode() * 31, 31), 31), 31);
    }

    /* renamed from: j, reason: from getter */
    public final long getEndTimeMs() {
        return this.endTimeMs;
    }

    public final bo0 k() {
        return this.items.get(this.startMediaIndex);
    }

    /* renamed from: l, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    public final bo0 n(int i13) {
        return this.items.get(i13);
    }

    public final long q() {
        Iterator<T> it = this.items.iterator();
        long j13 = 0;
        while (it.hasNext()) {
            k01 videoItem = ((bo0) it.next()).getVideoItem();
            j13 += videoItem != null ? videoItem.f39242e : 0L;
        }
        return j13;
    }

    /* renamed from: s, reason: from getter */
    public final int getStartMediaIndex() {
        return this.startMediaIndex;
    }

    public final String toString() {
        return "StoryPinLocalMediaList(items=" + this.items + ", startMediaIndex=" + this.startMediaIndex + ", startTimeMs=" + this.startTimeMs + ", endMediaIndex=" + this.endMediaIndex + ", endTimeMs=" + this.endTimeMs + ")";
    }

    /* renamed from: u, reason: from getter */
    public final long getStartTimeMs() {
        return this.startTimeMs;
    }

    public final long v() {
        Iterator it = new IntRange(this.startMediaIndex, this.endMediaIndex, 1).iterator();
        long j13 = 0;
        while (it.hasNext()) {
            int b13 = ((kotlin.collections.u0) it).b();
            bo0 bo0Var = (bo0) CollectionsKt.U(b13, this.items);
            if (bo0Var != null && bo0Var.getVideoItem() != null) {
                j13 = ((b13 == this.endMediaIndex ? bo0Var.getStartTimeMs() + this.endTimeMs : bo0Var.getEndTimeMs()) - (b13 == this.startMediaIndex ? bo0Var.getStartTimeMs() + this.startTimeMs : bo0Var.getStartTimeMs())) + j13;
            }
        }
        return j13;
    }

    public final boolean x() {
        return (this.startMediaIndex == 0 && this.startTimeMs == 0 && this.endMediaIndex == kotlin.collections.f0.i(this.items) && this.endTimeMs == ((bo0) d7.b.j0(this.items)).f36143i) ? false : true;
    }

    public final boolean y() {
        return this.items.size() == 1 && this.items.get(0).getPhotoItem() != null;
    }
}
