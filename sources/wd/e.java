package wd;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class e implements nd.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129163a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f129164b;

    public /* synthetic */ e(Object obj, int i13) {
        this.f129163a = i13;
        this.f129164b = obj;
    }

    @Override // nd.n
    public final boolean a(Object obj, nd.l lVar) {
        int i13 = this.f129163a;
        Object obj2 = this.f129164b;
        switch (i13) {
            case 0:
                ((o) obj2).getClass();
                break;
            case 1:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                if ((!"HUAWEI".equalsIgnoreCase(str) && !"HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) {
                    ((o) obj2).getClass();
                    if (!"robolectric".equals(Build.FINGERPRINT)) {
                    }
                }
                break;
            default:
                break;
        }
        return true;
    }

    @Override // nd.n
    public final pd.g0 b(Object obj, int i13, int i14, nd.l lVar) {
        int i15 = this.f129163a;
        Object obj2 = this.f129164b;
        switch (i15) {
            case 0:
                o oVar = (o) obj2;
                return oVar.a(new x92.b((ByteBuffer) obj, oVar.f129199d, oVar.f129198c, 9), i13, i14, lVar, o.f129194j);
            case 1:
                o oVar2 = (o) obj2;
                return oVar2.a(new androidx.appcompat.app.d((ParcelFileDescriptor) obj, oVar2.f129199d, oVar2.f129198c), i13, i14, lVar, o.f129194j);
            default:
                return c.e(((ld.e) ((ld.a) obj)).b(), (qd.d) obj2);
        }
    }
}
