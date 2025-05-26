package ue1;

import com.pinterest.api.model.e40;
import com.pinterest.api.model.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class f implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final v7 f122000a;

    /* renamed from: b, reason: collision with root package name */
    public final ka2.b f122001b;

    /* renamed from: c, reason: collision with root package name */
    public final ka2.a f122002c;

    /* renamed from: d, reason: collision with root package name */
    public final int f122003d;

    public f(@NotNull v7 board, @NotNull ka2.b boardActionsAnalytics, @NotNull ka2.a boardPreviewConfig) {
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(boardActionsAnalytics, "boardActionsAnalytics");
        Intrinsics.checkNotNullParameter(boardPreviewConfig, "boardPreviewConfig");
        this.f122000a = board;
        this.f122001b = boardActionsAnalytics;
        this.f122002c = boardPreviewConfig;
        this.f122003d = 43;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        String id3 = this.f122000a.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        return id3;
    }

    @Override // ue1.a0
    public final String d() {
        v7 v7Var = this.f122000a;
        Intrinsics.checkNotNullParameter(v7Var, "<this>");
        Boolean Y0 = v7Var.Y0();
        Intrinsics.checkNotNullExpressionValue(Y0, "getHasCustomCover(...)");
        String v13 = Y0.booleanValue() ? kh2.d.v(v7Var) : "";
        List U0 = kh2.d.U0(v7Var);
        ArrayList arrayList = new ArrayList(g0.q(U0, 10));
        Iterator it = U0.iterator();
        while (it.hasNext()) {
            arrayList.add(((e40) it.next()).c());
        }
        if (v13.length() > 0) {
            return v13;
        }
        if (!arrayList.isEmpty()) {
            return (String) arrayList.get(0);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f122000a, fVar.f122000a) && Intrinsics.d(this.f122001b, fVar.f122001b) && Intrinsics.d(this.f122002c, fVar.f122002c);
    }

    @Override // ue1.a0
    public final boolean f() {
        return false;
    }

    public final int hashCode() {
        return this.f122002c.hashCode() + ((this.f122001b.hashCode() + (this.f122000a.hashCode() * 31)) * 31);
    }

    @Override // ue1.a0
    public final p i() {
        return null;
    }

    @Override // ue1.a0
    public final int m() {
        return this.f122003d;
    }

    @Override // ue1.a0
    public final m p() {
        return null;
    }

    @Override // ue1.a0
    public final int t() {
        return xe1.v.f134804s;
    }

    public final String toString() {
        return "BoardRepItemViewModel(board=" + this.f122000a + ", boardActionsAnalytics=" + this.f122001b + ", boardPreviewConfig=" + this.f122002c + ")";
    }
}
