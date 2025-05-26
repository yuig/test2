package yq0;

import kotlin.jvm.functions.Function0;
import nx.r0;

/* loaded from: classes.dex */
public final class j extends a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f139710a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f139711b;

    public /* synthetic */ j() {
        this(true, false);
    }

    @Override // yq0.a
    public final Function0 getCreator() {
        return dl2.b.m2(getPinalytics(), this.f139710a ? getGridFeatureConfig() : null, new r0(this, 8));
    }

    public j(boolean z13, boolean z14) {
        this.f139710a = z13;
        this.f139711b = z14;
    }
}
