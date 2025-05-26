package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class co implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    public final List f36479a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f36480b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f36481c;

    static {
        new bo(null);
    }

    public co(@NotNull List<? extends ao> tabs, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f36479a = tabs;
        this.f36480b = z13;
        this.f36481c = z14;
    }

    public final boolean a() {
        return this.f36481c;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return String.valueOf(Objects.hash(this.f36479a));
    }

    public final List c() {
        return this.f36479a;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof co)) {
            return super.equals(obj);
        }
        List list = ((co) obj).f36479a;
        int size = list.size();
        List list2 = this.f36479a;
        if (size != list2.size()) {
            return false;
        }
        int i13 = 0;
        for (Object obj2 : list2) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            ao aoVar = (ao) obj2;
            ao aoVar2 = (ao) list.get(i13);
            if (!Intrinsics.d(aoVar.k(), aoVar2.k()) || !Intrinsics.d(aoVar.j(), aoVar2.j()) || ((Intrinsics.d(aoVar.k(), "board_more_ideas") && !Intrinsics.d(aoVar.l(), aoVar2.l())) || !Intrinsics.d(aoVar.h(), aoVar2.h()))) {
                return false;
            }
            i13 = i14;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f36480b) + (this.f36479a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HomeFeedTabsResponse(tabs=");
        sb3.append(this.f36479a);
        sb3.append(", showHomeFeedTabSettingsIcon=");
        sb3.append(this.f36480b);
        sb3.append(", disableTitleOverrides=");
        return a.a.r(sb3, this.f36481c, ")");
    }
}
