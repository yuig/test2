package v;

import android.media.AudioManager;
import android.os.Handler;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class f1 implements androidx.camera.core.impl.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123448a;

    /* renamed from: b, reason: collision with root package name */
    public final int f123449b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f123450c;

    /* renamed from: d, reason: collision with root package name */
    public Object f123451d;

    /* renamed from: e, reason: collision with root package name */
    public Object f123452e;

    /* renamed from: f, reason: collision with root package name */
    public Object f123453f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(b7.b bVar, int i13) {
        this(bVar);
        this.f123448a = 1;
    }

    public final b7.b a() {
        Object obj = this.f123451d;
        if (((AudioManager.OnAudioFocusChangeListener) obj) == null) {
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }
        int i13 = this.f123449b;
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = (AudioManager.OnAudioFocusChangeListener) obj;
        Handler handler = (Handler) this.f123452e;
        handler.getClass();
        return new b7.b(i13, onAudioFocusChangeListener, handler, (a7.f) this.f123453f, this.f123450c);
    }

    @Override // androidx.camera.core.impl.c1
    public final boolean b(int i13) {
        return this.f123450c && k(i13) != null;
    }

    public final void c(m7.d dVar, Handler handler) {
        handler.getClass();
        this.f123451d = dVar;
        this.f123452e = handler;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:12|(7:14|(2:53|(1:55)(7:56|57|(1:59)(1:(1:61)(2:62|63))|(2:20|(4:22|(3:24|(1:26)(1:28)|27)|29|(4:31|(2:33|(2:34|(1:43)(2:36|(2:38|39)(1:42))))(1:(3:45|(2:47|(1:50)(1:49))|51))|40|41)))|52|40|41))|16|(3:18|20|(0))|52|40|41)|67|68|(16:70|(1:72)|73|74|76|77|(10:79|(1:(1:82)(1:84))|85|86|88|89|(0)|52|40|41)(1:98)|83|85|86|88|89|(0)|52|40|41)|16|(0)|52|40|41) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x008e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x008f, code lost:
    
        kh2.m0.Y0("Camera2EncoderProfilesProvider", "Unable to get CamcorderProfile by quality: " + r20, r0);
        r0 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012b  */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.camera.core.impl.e] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v19, types: [androidx.camera.core.impl.d1] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    @Override // androidx.camera.core.impl.c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.camera.core.impl.d1 k(int r20) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.f1.k(int):androidx.camera.core.impl.d1");
    }

    public final String toString() {
        switch (this.f123448a) {
            case 3:
                return "Status Code: " + this.f123449b + ", Not Modified: " + this.f123450c;
            default:
                return super.toString();
        }
    }

    public f1(int i13, byte[] bArr, Map map) {
        this.f123448a = 3;
        this.f123449b = i13;
        this.f123451d = bArr;
        this.f123452e = map;
        this.f123450c = false;
    }

    public f1(String str, androidx.camera.core.impl.r rVar) {
        int i13;
        boolean z13 = false;
        this.f123448a = 0;
        this.f123452e = new HashMap();
        this.f123451d = str;
        try {
            i13 = Integer.parseInt(str);
            z13 = true;
        } catch (NumberFormatException unused) {
            kh2.m0.X0("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
            i13 = -1;
        }
        this.f123450c = z13;
        this.f123449b = i13;
        this.f123453f = rVar;
    }

    public f1(int i13) {
        this.f123448a = 1;
        this.f123453f = a7.f.f987g;
        this.f123449b = i13;
    }

    public f1(b7.b bVar) {
        this.f123448a = 1;
        this.f123449b = bVar.f22021a;
        this.f123451d = bVar.f22022b;
        this.f123452e = bVar.f22023c;
        this.f123453f = bVar.f22024d;
        this.f123450c = bVar.f22025e;
    }
}
