package w;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import java.util.HashMap;
import kh2.m0;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a */
    public final k f126947a;

    /* renamed from: b */
    public final androidx.appcompat.app.d f126948b;

    /* renamed from: c */
    public final HashMap f126949c = new HashMap();

    /* renamed from: d */
    public final HashMap f126950d = new HashMap();

    public y(StreamConfigurationMap streamConfigurationMap, androidx.appcompat.app.d dVar) {
        new HashMap();
        this.f126947a = new k(streamConfigurationMap);
        this.f126948b = dVar;
    }

    public final Size[] a(int i13) {
        HashMap hashMap = this.f126949c;
        if (hashMap.containsKey(Integer.valueOf(i13))) {
            if (((Size[]) hashMap.get(Integer.valueOf(i13))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) hashMap.get(Integer.valueOf(i13))).clone();
        }
        Size[] b13 = this.f126947a.b(i13);
        if (b13 != null && b13.length != 0) {
            Size[] j13 = this.f126948b.j(b13, i13);
            hashMap.put(Integer.valueOf(i13), j13);
            return (Size[]) j13.clone();
        }
        m0.X0("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i13);
        return b13;
    }
}
