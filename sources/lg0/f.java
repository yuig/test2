package lg0;

import java.util.List;
import kb.z;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import pc.h;
import rd.j;
import s30.m;

/* loaded from: classes5.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f83214i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f83215j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(j jVar, int i13) {
        super(1);
        this.f83214i = i13;
        this.f83215j = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s30.a aVar;
        s30.g gVar;
        int i13 = this.f83214i;
        j jVar = this.f83215j;
        switch (i13) {
            case 0:
                m data = (m) obj;
                Intrinsics.checkNotNullParameter(data, "data");
                if (Intrinsics.d(data.f111044b, "NOT_PUBLISHED")) {
                    a.a(jVar, b.f83206b);
                } else {
                    List list = data.f111043a;
                    if (list != null) {
                        a.a(jVar, new c(list));
                    }
                }
                break;
            default:
                h response = (h) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                s30.h hVar = (s30.h) response.f99563c;
                s30.b bVar = null;
                if (hVar != null && (gVar = hVar.f111033a) != null) {
                    Intrinsics.checkNotNullParameter(gVar, "<this>");
                    s30.c cVar = gVar instanceof s30.c ? (s30.c) gVar : null;
                    if (cVar != null) {
                        bVar = cVar.f111027e;
                    }
                }
                if (bVar != null && (aVar = bVar.f111021a) != null) {
                    String str = aVar.f111019b;
                    if (str == null) {
                        str = "";
                    }
                    Integer num = aVar.f111020c;
                    int intValue = num != null ? num.intValue() : 0;
                    Integer num2 = aVar.f111018a;
                    g gVar2 = new g(str, intValue, num2 != null ? num2.intValue() : 0);
                    String str2 = bVar.f111025e;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = bVar.f111024d;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = bVar.f111022b;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str5 = bVar.f111023c;
                    a.a(jVar, new d(gVar2, str2, str3, str4, str5 == null ? "" : str5));
                }
                break;
        }
        return z.a();
    }
}
