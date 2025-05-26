package p11;

import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import com.pinterest.feature.pin.creation.view.UploadPreviewView;
import com.pinterest.feature.pin.creation.view.UploadProgressBarLayout;
import com.pinterest.feature.pin.creation.view.UploadProgressTrackerView;
import com.pinterest.ui.imageview.WebImageView;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import pk.a0;

/* loaded from: classes.dex */
public final class q implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UploadProgressBarLayout f98678a;

    public q(UploadProgressBarLayout uploadProgressBarLayout) {
        this.f98678a = uploadProgressBarLayout;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull com.pinterest.feature.video.model.a cancelEvent) {
        Intrinsics.checkNotNullParameter(cancelEvent, "cancelEvent");
        UploadProgressBarLayout.e(this.f98678a);
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    @SuppressLint({"StringFormatInvalid"})
    public final void onEventMainThread(@NotNull com.pinterest.feature.video.model.d uploadEvent) {
        Unit unit;
        Intrinsics.checkNotNullParameter(uploadEvent, "uploadEvent");
        UploadProgressBarLayout uploadProgressBarLayout = this.f98678a;
        ((w) uploadProgressBarLayout.g().get()).i(uploadEvent);
        String path = uploadEvent.f48999b;
        if (path == null) {
            path = "";
        }
        UploadPreviewView uploadPreviewView = uploadProgressBarLayout.f47130h;
        uploadPreviewView.getClass();
        Intrinsics.checkNotNullParameter(path, "path");
        if (!Intrinsics.d(uploadPreviewView.f47116a, path)) {
            uploadPreviewView.f47116a = path;
            WebImageView webImageView = (WebImageView) uploadPreviewView.f47124i.getValue();
            webImageView.w1();
            webImageView.t2(new File(path));
            uploadPreviewView.f47120e = ph.a.A0(path);
        }
        String text = uploadEvent.f49001d;
        if (text == null) {
            text = uploadProgressBarLayout.getResources().getString(uploadEvent.f49000c);
            Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
        }
        a0.p(uploadProgressBarLayout.f47131i, text);
        int[] iArr = p.f98677a;
        com.pinterest.feature.video.model.e event = uploadEvent.f48998a;
        int i13 = iArr[event.ordinal()];
        float f13 = 1.0f;
        UploadProgressTrackerView uploadProgressTrackerView = uploadProgressBarLayout.f47133k;
        float f14 = uploadEvent.f49003f;
        long j13 = uploadEvent.f49004g;
        float f15 = uploadEvent.f49002e;
        switch (i13) {
            case 1:
                UploadProgressBarLayout.f47125n = true;
                UploadProgressBarLayout.f(uploadProgressBarLayout, true);
                uploadProgressTrackerView.f47137a = 0.0f;
                uploadProgressTrackerView.invalidate();
                AnimatorSet animatorSet = uploadProgressTrackerView.f47138b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                uploadProgressTrackerView.f47138b = null;
                uploadProgressTrackerView.a(UploadProgressTrackerView.b(uploadProgressTrackerView, f14, 5));
                unit = Unit.f80348a;
                el.a.B(unit);
                uploadProgressBarLayout.f47134l = uploadEvent;
                return;
            case 2:
            case 3:
                uploadProgressBarLayout.h(j13, f15, f14);
                unit = Unit.f80348a;
                el.a.B(unit);
                uploadProgressBarLayout.f47134l = uploadEvent;
                return;
            case 4:
                UploadProgressBarLayout.f47125n = true;
                UploadProgressBarLayout.f(uploadProgressBarLayout, true);
                uploadProgressTrackerView.a(UploadProgressTrackerView.b(uploadProgressTrackerView, f14, 5));
                unit = Unit.f80348a;
                el.a.B(unit);
                uploadProgressBarLayout.f47134l = uploadEvent;
                return;
            case 5:
                UploadProgressBarLayout.f47125n = false;
                UploadProgressBarLayout.f(uploadProgressBarLayout, false);
                unit = Unit.f80348a;
                el.a.B(unit);
                uploadProgressBarLayout.f47134l = uploadEvent;
                return;
            case 6:
                UploadProgressBarLayout.f47125n = false;
                com.pinterest.feature.video.model.d dVar = uploadProgressBarLayout.f47134l;
                if ((dVar != null ? dVar.f48998a : null) != com.pinterest.feature.video.model.e.CANCEL) {
                    UploadProgressBarLayout.f(uploadProgressBarLayout, true);
                    uploadProgressTrackerView.getClass();
                    uploadProgressTrackerView.c(uploadProgressTrackerView.f47140d, e0.b(UploadProgressTrackerView.b(uploadProgressTrackerView, 0.0f, 7)));
                }
            case 7:
            case 8:
                unit = Unit.f80348a;
                el.a.B(unit);
                uploadProgressBarLayout.f47134l = uploadEvent;
                return;
            case 9:
                UploadProgressBarLayout.f47125n = true;
                uploadProgressBarLayout.setVisibility(0);
                ru1.w wVar = uploadProgressBarLayout.f47126d;
                if (wVar != null) {
                    wVar.a(true, true);
                }
                uploadProgressTrackerView.f47137a = 0.0f;
                uploadProgressTrackerView.invalidate();
                AnimatorSet animatorSet2 = uploadProgressTrackerView.f47138b;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                uploadProgressTrackerView.f47138b = null;
                com.pinterest.feature.video.model.d dVar2 = uploadProgressBarLayout.f47134l;
                long j14 = 15000;
                if (dVar2 != null && dVar2.f48998a == com.pinterest.feature.video.model.e.IDEA_PIN_PRE_UPLOAD_UPLOADING) {
                    f13 = dVar2.f49003f;
                    j14 = dVar2.f49004g;
                }
                uploadProgressBarLayout.h(j14, 0.0f, f13);
                unit = Unit.f80348a;
                el.a.B(unit);
                uploadProgressBarLayout.f47134l = uploadEvent;
                return;
            case 10:
                uploadProgressBarLayout.h(j13, f15, f14);
                unit = Unit.f80348a;
                el.a.B(unit);
                uploadProgressBarLayout.f47134l = uploadEvent;
                return;
            case 11:
                UploadProgressBarLayout.f(uploadProgressBarLayout, true);
                uploadProgressTrackerView.a(UploadProgressTrackerView.b(uploadProgressTrackerView, 1.0f, 5));
                unit = Unit.f80348a;
                el.a.B(unit);
                uploadProgressBarLayout.f47134l = uploadEvent;
                return;
            case 12:
                Intrinsics.checkNotNullParameter(text, "text");
                UploadProgressBarLayout.f47125n = false;
                UploadProgressBarLayout.f(uploadProgressBarLayout, false);
                ((w) uploadProgressBarLayout.g().get()).d(new y42.j(text));
                unit = Unit.f80348a;
                el.a.B(unit);
                uploadProgressBarLayout.f47134l = uploadEvent;
                return;
            case 13:
                uploadProgressBarLayout.d(uploadEvent.f49005h, uploadEvent.f49008k);
                unit = Unit.f80348a;
                el.a.B(unit);
                uploadProgressBarLayout.f47134l = uploadEvent;
                return;
            case 14:
                if (uploadProgressBarLayout.f47126d != null) {
                    Intrinsics.checkNotNullParameter(event, "event");
                    Unit unit2 = Unit.f80348a;
                }
                unit = Unit.f80348a;
                el.a.B(unit);
                uploadProgressBarLayout.f47134l = uploadEvent;
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
