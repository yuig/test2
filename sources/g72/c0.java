package g72;

import java.util.function.BiConsumer;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class c0 implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63948a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f63949b;

    public /* synthetic */ c0(Object obj, int i13) {
        this.f63948a = i13;
        this.f63949b = obj;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i13 = this.f63948a;
        Object obj3 = this.f63949b;
        switch (i13) {
            case 0:
                Function2 tmp0 = (Function2) obj3;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj, obj2);
                break;
            case 1:
                ((qi2.b) obj3).b((ri2.e) obj, obj2);
                break;
            default:
                nj2.j jVar = (nj2.j) obj3;
                ri2.e eVar = (ri2.e) obj;
                aj2.b bVar = jVar.f91027g;
                if (bVar == null) {
                    aj2.b bVar2 = new aj2.b(r0.f90977b, ((nj2.a) jVar.f91024d).f90982g);
                    jVar.f91027g = bVar2;
                    bVar = bVar2;
                }
                bVar.c(eVar, obj2);
                break;
        }
    }
}
