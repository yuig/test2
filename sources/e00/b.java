package e00;

import com.pinterest.api.model.aa;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.lh0;
import com.pinterest.api.model.my0;
import com.pinterest.api.model.s50;
import com.pinterest.api.model.t50;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import n60.o;
import rz.d;
import vd0.c;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56757a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f56758b;

    public b(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f56758b = message;
    }

    @Override // rz.d
    public final Object b(c pinterestJsonObject) {
        ba baVar;
        int i13 = this.f56757a;
        Object obj = this.f56758b;
        switch (i13) {
            case 0:
                vd0.a o13 = o.o(pinterestJsonObject, "pinterestJsonObject", "data", "optJsonArray(...)");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int d2 = o13.d();
                for (int i14 = 0; i14 < d2; i14++) {
                    if (o13.j(i14).e("story_type")) {
                        ke0.a aVar = (ke0.a) ((bf2.b) ((se2.a) obj)).get();
                        c j13 = o13.j(i14);
                        Intrinsics.checkNotNullExpressionValue(j13, "optJsonObject(...)");
                        arrayList2.add(aVar.d(j13));
                    } else if (c.f125622b.e(o13.j(i14).f125623a, s50.class) instanceof s50) {
                        Object e13 = c.f125622b.e(o13.j(i14).f125623a, s50.class);
                        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.PinTag");
                        arrayList.add((s50) e13);
                    }
                }
                return new t50(arrayList, arrayList2);
            case 1:
                Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
                c m13 = pinterestJsonObject.m("data");
                if (m13 == null) {
                    m13 = new c();
                }
                String d13 = m13.d("redirect_status");
                if (d13 == null || d13.length() == 0) {
                    m13.t("redirect_status", m13.d("action"));
                }
                String d14 = m13.d("message");
                if (d14 == null || d14.length() == 0) {
                    m13.t("message", (String) obj);
                }
                my0 my0Var = new my0(m13.o("redirect_status", ""), m13.o("url", ""), m13.d("message"), m13.o("clickthrough_uuid", ""));
                Intrinsics.checkNotNullExpressionValue(my0Var, "make(...)");
                return my0Var;
            default:
                Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
                c m14 = pinterestJsonObject.m("data");
                if (m14 == null || (baVar = (ba) ((ke0.a) obj).d(m14)) == null) {
                    baVar = (ba) ((ke0.a) obj).d(pinterestJsonObject);
                }
                c m15 = pinterestJsonObject.m("sensitivity");
                Object e14 = m15 != null ? c.f125622b.e(m15.f125623a, lh0.class) : null;
                lh0 lh0Var = e14 instanceof lh0 ? (lh0) e14 : null;
                if (lh0Var == null) {
                    return baVar;
                }
                baVar.getClass();
                aa aaVar = new aa(baVar, 0);
                aaVar.f35678h = lh0Var;
                boolean[] zArr = aaVar.f35681k;
                if (zArr.length > 7) {
                    zArr[7] = true;
                }
                return aaVar.a();
        }
    }

    public b(ke0.a boardSectionDeserializer) {
        Intrinsics.checkNotNullParameter(boardSectionDeserializer, "boardSectionDeserializer");
        this.f56758b = boardSectionDeserializer;
    }

    public b(se2.a dynamicStoryDeserializer) {
        Intrinsics.checkNotNullParameter(dynamicStoryDeserializer, "dynamicStoryDeserializer");
        this.f56758b = dynamicStoryDeserializer;
    }
}
