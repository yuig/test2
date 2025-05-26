package ec1;

import ap.o;
import com.pinterest.api.model.wy0;
import java.util.LinkedHashSet;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import mf0.l;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f58390i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f58391j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(j jVar, int i13) {
        super(1);
        this.f58390i = i13;
        this.f58391j = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        int i13 = this.f58390i;
        j jVar = this.f58391j;
        switch (i13) {
            case 0:
                Objects.toString((pc.h) obj);
                o oVar = jVar.f58426d;
                oVar.f20290j.c("PREF_UPLOAD_CONTACTS_DIALOG_LAST_SHOWN", 0L);
                LinkedHashSet b13 = oVar.b();
                if (b13 != null) {
                    wy0 f13 = ((b60.d) oVar.f20288h).f();
                    if (f13 == null || (str = f13.getUid()) == null) {
                        str = "";
                    }
                    dl2.b.s(b13).remove(o.a(str, b13));
                    oVar.f20289i.j("PREF_ACCOUNTS_STORED_CONTACTS", b13);
                }
                break;
            case 1:
                jVar.f58423a.d(new of0.a(new l()));
                break;
            default:
                Throwable it = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ep.b.C(null, jVar.f58423a);
                break;
        }
        return Unit.f80348a;
    }
}
