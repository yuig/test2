package ug0;

import com.pinterest.experience.api.internal.ExperienceNotFoundException;
import jk2.h0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import uj2.q;

/* loaded from: classes.dex */
public final class h extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f122133i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f122134j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ nl.b f122135k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, nl.b bVar, int i13) {
        super(1);
        this.f122133i = i13;
        this.f122134j = iVar;
        this.f122135k = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nl.b bVar = this.f122135k;
        i iVar = this.f122134j;
        int i13 = this.f122133i;
        switch (i13) {
            case 0:
                vd0.c response = (vd0.c) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(response, "response");
                        return iVar.b(bVar, response);
                    default:
                        Intrinsics.checkNotNullParameter(response, "response");
                        return iVar.b(bVar, response);
                }
            case 1:
                vd0.c response2 = (vd0.c) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(response2, "response");
                        return iVar.b(bVar, response2);
                    default:
                        Intrinsics.checkNotNullParameter(response2, "response");
                        return iVar.b(bVar, response2);
                }
            default:
                c result = (c) obj;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean z13 = result instanceof b;
                h0 h0Var = h0.f76488a;
                if (z13) {
                    vd0.c cVar = ((b) result).f122125b;
                    return cVar != null ? iVar.b(bVar, cVar) : h0Var;
                }
                if (!(result instanceof a)) {
                    throw new NoWhenBranchMatchedException();
                }
                Throwable th3 = ((a) result).f122124b;
                return th3 instanceof ExperienceNotFoundException ? h0Var : q.r(th3);
        }
    }
}
