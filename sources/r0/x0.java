package r0;

import a.sc;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.Surface;
import androidx.camera.core.impl.v2;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import c0.p1;
import com.pinterest.api.model.qq;
import com.pinterest.feature.ideaPinCreation.closeup.view.u1;
import com.pinterest.feature.ideaPinCreation.worker.IdeaPinVideoExportWorker;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class x0 implements r4.j, uj2.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f105676a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f105677b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f105678c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f105679d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f105680e;

    public /* synthetic */ x0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f105676a = obj;
        this.f105677b = obj2;
        this.f105678c = obj3;
        this.f105679d = obj4;
        this.f105680e = obj5;
    }

    @Override // r4.j
    public final Object C(final r4.i iVar) {
        Surface surface;
        final a1 a1Var = (a1) this.f105676a;
        final p1 p1Var = (p1) this.f105677b;
        v2 v2Var = (v2) this.f105678c;
        t0.a aVar = (t0.a) this.f105679d;
        e eVar = (e) this.f105680e;
        a1Var.getClass();
        c0.z zVar = p1Var.f24301c;
        y0.e b13 = x0.b.b(x0.b.c(eVar, zVar, aVar), v2Var, eVar.f105509a, p1Var.f24300b, zVar, p1Var.f24302d);
        try {
            sc scVar = a1Var.f105480c;
            Executor executor = a1Var.f105478a;
            scVar.getClass();
            y0.c0 c0Var = new y0.c0(executor, b13);
            a1Var.f105481d = c0Var;
            y0.k kVar = c0Var.f136282f;
            if (kVar instanceof y0.b0) {
                y0.b0 b0Var = (y0.b0) kVar;
                Executor executor2 = a1Var.f105479b;
                y0.l lVar = new y0.l() { // from class: r0.y0
                    @Override // y0.l
                    public final void a(Surface surface2) {
                        Executor executor3;
                        a1 a1Var2 = a1.this;
                        int ordinal = a1Var2.f105486i.ordinal();
                        r4.i iVar2 = iVar;
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                p1 p1Var2 = p1Var;
                                if (p1Var2.a()) {
                                    kh2.m0.p("VideoEncoderSession", "Not provide surface, " + Objects.toString(p1Var2, "EMPTY") + " is already serviced.");
                                    iVar2.b(null);
                                    a1Var2.a();
                                    return;
                                }
                                a1Var2.f105482e = surface2;
                                kh2.m0.p("VideoEncoderSession", "provide surface: " + surface2);
                                p1Var2.b(surface2, a1Var2.f105479b, new l0.v(a1Var2, 5));
                                a1Var2.f105486i = z0.READY;
                                iVar2.b(a1Var2.f105481d);
                                return;
                            }
                            if (ordinal != 2) {
                                if (ordinal == 3) {
                                    if (a1Var2.f105485h != null && (executor3 = a1Var2.f105484g) != null) {
                                        executor3.execute(new l0.e(11, a1Var2, surface2));
                                    }
                                    kh2.m0.X0("VideoEncoderSession", "Surface is updated in READY state: " + surface2);
                                    return;
                                }
                                if (ordinal != 4) {
                                    throw new IllegalStateException("State " + a1Var2.f105486i + " is not handled");
                                }
                            }
                        }
                        kh2.m0.p("VideoEncoderSession", "Not provide surface in " + a1Var2.f105486i);
                        iVar2.b(null);
                    }
                };
                synchronized (b0Var.f136265a) {
                    b0Var.f136268d = lVar;
                    executor2.getClass();
                    b0Var.f136269e = executor2;
                    surface = b0Var.f136266b;
                }
                if (surface != null) {
                    try {
                        executor2.execute(new l0.e(26, lVar, surface));
                    } catch (RejectedExecutionException e13) {
                        kh2.m0.t(b0Var.f136270f.f136277a, "Unable to post to the supplied executor.", e13);
                    }
                }
            } else {
                iVar.d(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
            }
        } catch (InvalidConfigException e14) {
            kh2.m0.t("VideoEncoderSession", "Unable to initialize video encoder.", e14);
            iVar.d(e14);
        }
        return "ConfigureVideoEncoderFuture " + a1Var;
    }

    @Override // uj2.e0
    public final void g(kk2.a emitter) {
        IdeaPinVideoExportWorker this$0 = (IdeaPinVideoExportWorker) this.f105676a;
        RectF creationRect = (RectF) this.f105677b;
        qq block = (qq) this.f105678c;
        dl1.s model = (dl1.s) this.f105679d;
        RectF tagMoveRect = (RectF) this.f105680e;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(creationRect, "$creationRect");
        Intrinsics.checkNotNullParameter(block, "$block");
        Intrinsics.checkNotNullParameter(model, "$model");
        Intrinsics.checkNotNullParameter(tagMoveRect, "$tagMoveRect");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        com.pinterest.feature.ideaPinCreation.closeup.view.s0 s0Var = new com.pinterest.feature.ideaPinCreation.closeup.view.s0(this$0.f46654k, block, model, creationRect.height(), creationRect.width(), tagMoveRect);
        a.z0 bitmapListener = new a.z0(emitter, 2);
        Intrinsics.checkNotNullParameter(bitmapListener, "bitmapListener");
        KeyEvent.Callback callback = s0Var.f46318t;
        Intrinsics.g(callback, "null cannot be cast to non-null type com.pinterest.feature.ideaPinCreation.closeup.view.IdeaPinStickerRepView");
        ((u1) callback).b(new l0.d(s0Var, callback, bitmapListener, 16));
    }
}
