package qw0;

import com.pinterest.feature.video.view.IdeaPinVideoExportLoadingView;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;
import oy.b0;
import pw0.e0;
import s92.o;
import sw0.j0;

/* loaded from: classes5.dex */
public final class c extends hb0.d {

    /* renamed from: d, reason: collision with root package name */
    public boolean f105269d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f105270e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f105271f;

    public c(j jVar) {
        this.f105271f = jVar;
    }

    @Override // hb0.c
    public final void b() {
        this.f105270e = true;
        super.b();
    }

    @Override // hb0.c
    public final void c() {
        long j13 = 0;
        while (this.f105270e && !this.f105271f.t3()) {
            if (j13 > 300000) {
                this.f105269d = true;
                new b0(d4.STORY_PIN_MULTI_PHOTO_PICKER, null, o.ERROR, "Timeout", 2).i();
                return;
            } else {
                Thread.sleep(100L);
                j13 += 100;
            }
        }
    }

    @Override // hb0.d
    public final void e() {
        if (this.f105270e) {
            j jVar = this.f105271f;
            if (jVar.isBound()) {
                IdeaPinVideoExportLoadingView ideaPinVideoExportLoadingView = ((j0) ((e0) jVar.getView())).f115471b1;
                if (ideaPinVideoExportLoadingView == null) {
                    Intrinsics.r("videoExportLoadingView");
                    throw null;
                }
                bs1.c.R1(ideaPinVideoExportLoadingView, false);
                if (!this.f105269d) {
                    jVar.B3();
                    return;
                }
                ((j0) ((e0) jVar.getView())).a9(dq1.f.image_to_video_conversion_error);
            }
        }
    }
}
