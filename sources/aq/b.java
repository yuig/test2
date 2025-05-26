package aq;

import com.pinterest.api.model.mk0;
import com.pinterest.api.model.no0;
import com.pinterest.api.model.pq0;
import com.pinterest.api.model.vg;
import kh2.n3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b extends vg {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20339b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i13) {
        super(Boolean.TRUE);
        this.f20339b = i13;
        if (i13 == 1) {
            super(Boolean.FALSE);
        } else if (i13 != 2) {
        } else {
            super(Boolean.FALSE);
        }
    }

    @Override // com.pinterest.api.model.vg
    public final Object f(no0 value7) {
        Boolean m13;
        switch (this.f20339b) {
            case 0:
                Intrinsics.checkNotNullParameter(value7, "value7");
                mk0 e13 = value7.e();
                return (e13 == null || (m13 = e13.m()) == null) ? Boolean.TRUE : m13;
            default:
                return super.f(value7);
        }
    }

    @Override // com.pinterest.api.model.vg
    public final /* bridge */ /* synthetic */ Object j(pq0 pq0Var) {
        switch (this.f20339b) {
            case 1:
                return l(pq0Var);
            case 2:
                return l(pq0Var);
            default:
                return super.j(pq0Var);
        }
    }

    public final Boolean l(pq0 value6) {
        boolean z13 = false;
        switch (this.f20339b) {
            case 1:
                Intrinsics.checkNotNullParameter(value6, "value6");
                String h10 = value6.h();
                Intrinsics.checkNotNullExpressionValue(h10, "getVideoSignature(...)");
                if (h10.length() > 0) {
                    Intrinsics.checkNotNullParameter(value6, "<this>");
                    if (n3.s(value6) == null) {
                        z13 = true;
                    }
                }
                return Boolean.valueOf(z13);
            default:
                Intrinsics.checkNotNullParameter(value6, "value6");
                String h13 = value6.h();
                Intrinsics.checkNotNullExpressionValue(h13, "getVideoSignature(...)");
                if (h13.length() > 0) {
                    Intrinsics.checkNotNullParameter(value6, "<this>");
                    if (n3.s(value6) == null) {
                        z13 = true;
                    }
                }
                return Boolean.valueOf(z13);
        }
    }
}
