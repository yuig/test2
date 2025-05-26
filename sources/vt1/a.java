package vt1;

import a.z0;
import android.content.res.Resources;
import android.media.MediaFormat;
import androidx.camera.video.internal.encoder.EncodeException;
import com.pinterest.api.model.UploadStatus;
import com.pinterest.api.model.d30;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.lo;
import com.pinterest.api.model.no;
import com.pinterest.api.model.pc0;
import com.pinterest.api.model.pu;
import com.pinterest.feature.ideaPinCreation.producttagging.view.IdeaPinProductTagsItemView;
import ct1.d;
import et1.j;
import ey.e0;
import h32.f1;
import h61.h;
import i92.k;
import java.io.File;
import java.util.HashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.h1;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import rw0.f;
import sw0.y;
import sw0.z;
import vn1.c;
import x62.e;
import y0.i;
import y0.n;
import y90.a2;
import y90.i1;
import y90.o1;
import y90.t1;

/* loaded from: classes4.dex */
public final class a implements e, u6.b, n, i1, o1, t1, a2, pr0.a, hl1.a {
    public static final c s(boolean z13) {
        int i13 = IdeaPinProductTagsItemView.f46551k;
        return z13 ? c.SUBTLE : c.DEFAULT;
    }

    public static final boolean t(UploadStatus uploadStatus) {
        return Intrinsics.d(uploadStatus.getType(), pc0.REGISTER_TYPE_VIDEO.getValue()) || Intrinsics.d(uploadStatus.getType(), pc0.REGISTER_TYPE_STORY_PIN_VIDEO.getValue()) || Intrinsics.d(uploadStatus.getType(), pc0.REGISTER_TYPE_NOOP_VIDEO_PIPELINE.getValue());
    }

    public static y u() {
        return (y) y.f115589f.getValue();
    }

    public static boolean v(pu media, boolean z13, k toastUtils, Resources resources, d0 pinalytics) {
        boolean z14;
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        if (media instanceof d30) {
            d30 d30Var = (d30) media;
            HashMap hashMap = f.f110112b;
            if (((Integer) d30Var.h().f80346a).intValue() < 75 || ((Integer) d30Var.h().f80347b).intValue() < 75) {
                toastUtils.i(resources.getQuantityString(d.image_create_too_small, 5625, 75, 75));
                return false;
            }
            int intValue = ((Integer) d30Var.h().f80347b).intValue() * ((Integer) d30Var.h().f80346a).intValue();
            if (intValue <= 89478485 && intValue > 0) {
                return true;
            }
            toastUtils.i(resources.getString(ct1.e.image_create_too_large));
            return false;
        }
        k01 k01Var = (k01) media;
        if (!CollectionsKt.L(z.f115597a, k01Var.f39241d)) {
            toastUtils.i(resources.getString(ct1.e.video_create_wrong_format));
            return false;
        }
        if (!z13) {
            double intValue2 = ((Number) k01Var.f39240c.f135234a).intValue() / ((Number) k01Var.f39240c.f135235b).floatValue();
            if (intValue2 < 0.5d || intValue2 > 1.91d) {
                toastUtils.i(resources.getString(ct1.e.video_create_wrong_ratio));
                return false;
            }
        }
        if (!z13) {
            long j13 = k01Var.f39242e;
            if (j13 < 4000) {
                toastUtils.i(resources.getString(ct1.e.video_create_duration_too_short));
                return false;
            }
            if (j13 > 900000) {
                toastUtils.i(resources.getString(ct1.e.video_create_duration_too_long));
                return false;
            }
        } else {
            if (k01Var.f39242e < 1000) {
                toastUtils.i(resources.getString(ct1.e.story_pin_video_too_short));
                return false;
            }
            j jVar = new j();
            jVar.d(k01Var.e());
            int trackCount = jVar.f60034a.getTrackCount();
            for (int i13 = 0; i13 < trackCount; i13++) {
                MediaFormat format = jVar.a(i13);
                Intrinsics.checkNotNullParameter(format, "format");
                String c13 = nt1.d.c(format);
                if (c13 == null) {
                    c13 = "";
                }
                if (nt1.d.e(c13) && (l3.c.z(format) > 2 || !h1.f("audio/mp4a-latm", "audio/3gpp", "audio/amr-wb").contains(c13))) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("reason", "Unsupported media selected [channelCount=" + l3.c.z(format) + ",mimeType=" + nt1.d.c(format) + "]");
                    pinalytics.g(f1.STORY_PIN_VIDEO_EXPORT_INCOMPATIBLE_MEDIA, "0", hashMap2, false);
                    z14 = true;
                    break;
                }
            }
            z14 = false;
            jVar.b();
            if (z14) {
                toastUtils.i(resources.getString(ct1.e.story_pin_audio_format_not_supported));
                return false;
            }
        }
        if (z13 && hf0.b.q()) {
            float intValue3 = ((Number) k01Var.f39240c.f135234a).intValue() / ((Number) k01Var.f39240c.f135235b).floatValue();
            if (intValue3 < ((float) lo.f39845e.d()) || intValue3 > ((float) no.f40447e.d())) {
                toastUtils.i(resources.getString(ct1.e.unified_pin_tablet_unsupported_aspect_ratio));
                return false;
            }
            if (k01Var.f39242e > pp2.a.u()) {
                toastUtils.i(bs1.c.b2(ct1.e.pin_media_gallery_video_too_long));
                return false;
            }
        }
        if (new File(k01Var.e()).length() <= 2000000000) {
            return true;
        }
        toastUtils.i(resources.getString(ct1.e.video_create_size_too_large));
        return false;
    }

    @Override // pr0.a
    public void b(Object obj) {
        h hVar = (h) obj;
        if (hVar != null) {
            new ey.z(hVar.toPWTSearchType()).i();
        }
    }

    @Override // pr0.a
    public /* bridge */ /* synthetic */ void c(Object obj) {
    }

    @Override // x62.e
    public void d(int i13, int i14) {
    }

    @Override // y0.n
    public void e() {
    }

    @Override // y0.n
    public void l(EncodeException encodeException) {
    }

    @Override // y0.n
    public void m(z0 z0Var) {
    }

    @Override // pr0.a
    public void o(int i13, ny.f fVar, e0 e0Var, Object obj) {
        h hVar = (h) obj;
        if (hVar != null) {
            new ey.z(hVar.toPWTSearchType()).i();
        }
    }

    @Override // y0.n
    public void q(i iVar) {
    }

    @Override // pr0.a
    public /* bridge */ /* synthetic */ void r(Object obj) {
    }
}
