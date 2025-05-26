package com.pinterest.api.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/pinterest/api/model/r2;", "Ldl1/s;", "", "", "a", "Ljava/util/List;", "getAdvertisers", "()Ljava/util/List;", "advertisers", "<init>", "(Ljava/util/List;)V", "com/pinterest/api/model/q2", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class r2 implements dl1.s {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("data")
    @NotNull
    private final List<Object> advertisers;

    static {
        new q2(null);
    }

    public r2(@NotNull List<Object> advertisers) {
        Intrinsics.checkNotNullParameter(advertisers, "advertisers");
        this.advertisers = advertisers;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getF39332b() {
        return "0";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r2) && Intrinsics.d(this.advertisers, ((r2) obj).advertisers);
    }

    public final int hashCode() {
        return this.advertisers.hashCode();
    }

    public final String toString() {
        return "Advertisers(advertisers=" + this.advertisers + ")";
    }
}
