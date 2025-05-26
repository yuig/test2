package w2;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import android.widget.RemoteViews;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ ScrollCaptureSession a(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    public static /* synthetic */ ScrollCaptureTarget b(View view, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(view, rect, point, scrollCaptureCallback);
    }

    public static /* synthetic */ ViewTranslationRequest.Builder f(AutofillId autofillId, long j13) {
        return new ViewTranslationRequest.Builder(autofillId, j13);
    }

    public static /* bridge */ /* synthetic */ ViewTranslationResponse h(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    public static /* synthetic */ RemoteViews i(LinkedHashMap linkedHashMap) {
        return new RemoteViews(linkedHashMap);
    }

    public static /* synthetic */ void l() {
    }
}
