package ic1;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;
import u40.z;

/* loaded from: classes5.dex */
public final class d implements ia2.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f72071a;

    /* renamed from: b, reason: collision with root package name */
    public final String f72072b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f72073c;

    /* renamed from: d, reason: collision with root package name */
    public final String f72074d;

    public d(z zVar) {
        String str = zVar.f120453d;
        String str2 = zVar.f120456g;
        String str3 = zVar.f120455f;
        this.f72071a = dl2.b.R2(str == null ? str3 == null ? str2 == null ? "" : str2 : str3 : str);
        String str4 = zVar.f120459j;
        this.f72072b = str4 == null ? "" : str4;
        u40.y yVar = zVar.f120465p;
        this.f72073c = Intrinsics.d(yVar != null ? yVar.f120443b : null, Boolean.TRUE);
        if (str3 == null || kotlin.text.z.j(str3)) {
            String str5 = zVar.f120453d;
            if (str5 == null || kotlin.text.z.j(str5)) {
                String str6 = zVar.f120454e;
                if (str6 != null && !kotlin.text.z.j(str6)) {
                    str2 = str6;
                } else if (str2 == null || kotlin.text.z.j(str2)) {
                    str2 = "";
                }
            } else {
                str2 = str5;
            }
        } else {
            str2 = str3;
        }
        this.f72074d = str2;
    }

    @Override // ia2.b
    public final wy0 b() {
        return null;
    }

    @Override // ia2.b
    public final boolean c() {
        return this.f72073c;
    }

    @Override // ia2.b
    public final String d() {
        return this.f72072b;
    }

    @Override // ia2.b
    public final String getDescription() {
        return this.f72074d;
    }

    @Override // ia2.b
    public final String getName() {
        return this.f72071a;
    }
}
