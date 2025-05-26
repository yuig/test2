package androidx.media3.ui;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.text.GraphemeClusterSegmentFinder;
import android.text.SegmentFinder;
import android.text.TextPaint;
import android.window.SurfaceSyncGroup;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a0 {
    public static /* synthetic */ void A() {
        new DeletionRequest.Builder();
    }

    public static /* synthetic */ void B() {
    }

    public static /* synthetic */ void C() {
    }

    public static /* bridge */ /* synthetic */ MeasurementManager c(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* synthetic */ GetTopicsRequest.Builder d() {
        return new GetTopicsRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ GetTopicsResponse g(Object obj) {
        return (GetTopicsResponse) obj;
    }

    public static /* bridge */ /* synthetic */ Topic h(Object obj) {
        return (Topic) obj;
    }

    public static /* bridge */ /* synthetic */ TopicsManager j(Object obj) {
        return (TopicsManager) obj;
    }

    public static /* synthetic */ GraphemeClusterSegmentFinder k(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinder(charSequence, textPaint);
    }

    public static /* bridge */ /* synthetic */ SegmentFinder l(Object obj) {
        return (SegmentFinder) obj;
    }

    public static /* synthetic */ SurfaceSyncGroup m() {
        return new SurfaceSyncGroup("exo-sync-b-334901521");
    }

    public static /* bridge */ /* synthetic */ Class n() {
        return MeasurementManager.class;
    }

    public static /* synthetic */ void p() {
    }

    public static /* bridge */ /* synthetic */ Class z() {
        return TopicsManager.class;
    }
}
