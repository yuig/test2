package s81;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.ui.camera.CameraPreview;
import h32.f1;
import h32.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import uj2.q;
import yk1.r;

/* loaded from: classes5.dex */
public final class b extends yk1.p implements m81.e {

    /* renamed from: a, reason: collision with root package name */
    public final hf0.c f111885a;

    /* renamed from: b, reason: collision with root package name */
    public final m81.h f111886b;

    /* renamed from: c, reason: collision with root package name */
    public String f111887c;

    /* renamed from: d, reason: collision with root package name */
    public int f111888d;

    /* renamed from: e, reason: collision with root package name */
    public int f111889e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f111890f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f111891g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f111892h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f111893i;

    /* renamed from: j, reason: collision with root package name */
    public final Handler f111894j;

    /* renamed from: k, reason: collision with root package name */
    public final a f111895k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v4, types: [s81.a] */
    public b(hf0.c deviceInfoProvider, uk1.d presenterPinalytics, q networkStateStream, m81.h hVar) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(deviceInfoProvider, "deviceInfoProvider");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f111885a = deviceInfoProvider;
        this.f111886b = hVar;
        this.f111887c = "auto";
        this.f111890f = new ArrayList();
        this.f111894j = new Handler(Looper.getMainLooper());
        this.f111895k = new Camera.PictureCallback() { // from class: s81.a
            @Override // android.hardware.Camera.PictureCallback
            public final void onPictureTaken(byte[] bArr, Camera camera) {
                b this$0 = b.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                d0 pinalytics = this$0.getPinalytics();
                m81.h hVar2 = this$0.f111886b;
                f1 f1Var = f1.FLASHLIGHT_CAMERA_TAP_SNAP;
                u0 u0Var = u0.FLASHLIGHT_CAMERA_SCOPE;
                HashMap hashMap = new HashMap();
                hashMap.put("flash", this$0.f111887c);
                hashMap.put("camera_direction", this$0.f111888d == 0 ? "back" : "front");
                pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : "", (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                camera.stopPreview();
                fa2.c.h();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.RGB_565;
                try {
                    Bitmap bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                    if (bitmap != null && hVar2 != null) {
                        int i13 = this$0.f111888d;
                        p pVar = (p) hVar2;
                        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                        pVar.L = a32.c.CAMERA_SNAP;
                        if (pVar.f111940r == m81.p.ROOM_REPAINT) {
                            pVar.g4(h.ROOM_REPAINT_STYLE_PICKER);
                        } else {
                            pVar.g4(h.SEARCH_RESULTS);
                            pVar.e4(pVar.z3());
                        }
                        pVar.i4(bitmap, i13, false, null);
                        pVar.h4(bitmap, i13, false, null);
                        pVar.M = i13 == 0 ? a32.i.BACK : a32.i.FRONT;
                    }
                } catch (OutOfMemoryError e13) {
                    HashSet hashSet = tb0.h.f117076w;
                    tb0.g.f117075a.o("Failed to allocate memory for lens photo", e13);
                }
                if (hVar2 != null) {
                    ((p) hVar2).j4(false);
                }
                if (this$0.isBound()) {
                    u81.i iVar = (u81.i) ((m81.f) this$0.getView());
                    GestaltIconButton gestaltIconButton = iVar.f121031b;
                    com.bumptech.glide.c.d0(iVar.f121032c);
                    com.bumptech.glide.c.d0(gestaltIconButton);
                    CameraPreview cameraPreview = iVar.f121034e;
                    cameraPreview.f52243c = false;
                    fa2.c.d(cameraPreview);
                }
            }
        };
    }

    @Override // yk1.p
    public final void bindPinalytics(r rVar) {
        m81.f view = (m81.f) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        m81.f view = (m81.f) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        u81.i iVar = (u81.i) view;
        Intrinsics.checkNotNullParameter(this, "listener");
        iVar.f121040k = this;
        iVar.i();
    }

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        u81.i iVar = (u81.i) ((m81.f) getView());
        iVar.f121034e.f52245e = null;
        iVar.f121042m = null;
        iVar.f121043n = null;
        fa2.b bVar = iVar.f121038i;
        if (bVar != null) {
            bVar.cancel(true);
        }
        this.f111893i = false;
        this.f111894j.removeCallbacksAndMessages(null);
        super.onUnbind();
    }

    @Override // yk1.p
    public final void unbindPinalytics() {
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        m81.f view = (m81.f) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        u81.i iVar = (u81.i) view;
        Intrinsics.checkNotNullParameter(this, "listener");
        iVar.f121040k = this;
        iVar.i();
    }
}
