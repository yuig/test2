package kn0;

import com.pinterest.api.model.hb;
import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f80226a;

    /* renamed from: b, reason: collision with root package name */
    public final hb f80227b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f80228c;

    /* renamed from: d, reason: collision with root package name */
    public final String f80229d;

    /* renamed from: e, reason: collision with root package name */
    public final String f80230e;

    public /* synthetic */ d(String str, hb hbVar, i0 i0Var) {
        this(str, hbVar, i0Var, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.d(d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.feature.boardsection.bulkaction.BulkActionPollingRequestParams");
        d dVar = (d) obj;
        return Intrinsics.d(this.f80226a, dVar.f80226a) && this.f80227b == dVar.f80227b;
    }

    public final int hashCode() {
        return this.f80227b.hashCode() + (this.f80226a.hashCode() * 31);
    }

    public d(String boardId, hb actionType, i0 completionToastMessage, String str, String str2) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(completionToastMessage, "completionToastMessage");
        this.f80226a = boardId;
        this.f80227b = actionType;
        this.f80228c = completionToastMessage;
        this.f80229d = str;
        this.f80230e = str2;
    }
}
