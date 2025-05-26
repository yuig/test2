package s7;

import android.content.Context;
import android.net.Uri;
import android.opengl.Matrix;
import android.text.TextUtils;
import android.widget.LinearLayout;
import androidx.media3.exoplayer.drm.MediaDrmCallbackException;
import com.pinterest.feature.shopping.shoppingstories.feed.emptystate.StructuredFeedEmptyStateView;
import com.pinterest.ui.imageview.WebImageView;
import d7.j0;
import d7.n0;
import h32.f1;
import h32.g0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kh2.a1;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import pk.a3;

/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public boolean f111345a;

    /* renamed from: b, reason: collision with root package name */
    public Object f111346b;

    /* renamed from: c, reason: collision with root package name */
    public Object f111347c;

    /* renamed from: d, reason: collision with root package name */
    public Object f111348d;

    public z(int i13) {
        if (i13 != 4) {
            this.f111346b = new float[16];
            this.f111347c = new float[16];
            this.f111348d = new j0();
        } else {
            this.f111346b = new ArrayList();
            this.f111347c = null;
            this.f111348d = el.v.f59543b;
            this.f111345a = false;
        }
    }

    public static void b(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f13 = fArr2[10];
        float f14 = fArr2[8];
        float sqrt = (float) Math.sqrt((f14 * f14) + (f13 * f13));
        float f15 = fArr2[10];
        fArr[0] = f15 / sqrt;
        float f16 = fArr2[8];
        fArr[2] = f16 / sqrt;
        fArr[8] = (-f16) / sqrt;
        fArr[10] = f15 / sqrt;
    }

    public final void a() {
        int i13 = 2;
        if (this.f111345a) {
            StructuredFeedEmptyStateView structuredFeedEmptyStateView = (StructuredFeedEmptyStateView) this.f111346b;
            structuredFeedEmptyStateView.e(((yk1.a) ((yk1.v) this.f111348d)).f139224a.getString(d62.c.structured_feed_empty_state_end_of_feed_header_text));
            structuredFeedEmptyStateView.g(((yk1.a) ((yk1.v) this.f111348d)).f139224a.getString(d62.c.structured_feed_empty_state_end_of_feed_message_text));
            structuredFeedEmptyStateView.b(new ee1.d(this, i13));
        } else {
            StructuredFeedEmptyStateView structuredFeedEmptyStateView2 = (StructuredFeedEmptyStateView) this.f111346b;
            int i14 = mz1.d.shopping_filter_empty_state;
            structuredFeedEmptyStateView2.getClass();
            WebImageView webImageView = new WebImageView(structuredFeedEmptyStateView2.getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.bottomMargin = structuredFeedEmptyStateView2.f48498a;
            webImageView.setLayoutParams(layoutParams);
            structuredFeedEmptyStateView2.setGravity(17);
            Context context = webImageView.getContext();
            Object obj = d5.a.f53679a;
            webImageView.setImageDrawable(context.getDrawable(i14));
            structuredFeedEmptyStateView2.addView(webImageView);
            structuredFeedEmptyStateView2.e(((yk1.a) ((yk1.v) this.f111348d)).f139224a.getString(d62.c.structured_feed_empty_state_header_text));
            structuredFeedEmptyStateView2.g(((yk1.a) ((yk1.v) this.f111348d)).f139224a.getString(d62.c.structured_feed_empty_state_message_text));
            structuredFeedEmptyStateView2.b(new ee1.d(this, i13));
            float b13 = r70.b.f106349i.k0().b();
            int dimensionPixelOffset = ((yk1.a) ((yk1.v) this.f111348d)).f139224a.getDimensionPixelOffset(eo1.c.toolbar_height);
            StructuredFeedEmptyStateView structuredFeedEmptyStateView3 = (StructuredFeedEmptyStateView) this.f111346b;
            structuredFeedEmptyStateView3.setPaddingRelative(structuredFeedEmptyStateView3.getPaddingStart(), structuredFeedEmptyStateView3.getPaddingTop() - dimensionPixelOffset, structuredFeedEmptyStateView3.getPaddingEnd(), ((StructuredFeedEmptyStateView) this.f111346b).getPaddingBottom() + ((int) b13));
        }
        d0.B((d0) this.f111347c, f1.VIEW, this.f111345a ? g0.STRUCTURED_FEED_END_OF_FEED_EMPTY_STATE : g0.STRUCTURED_FEED_FULL_FEED_EMPTY_STATE, null, null, 28);
    }

    public final byte[] c(UUID uuid, t tVar) {
        String str = tVar.f111333b;
        if (this.f111345a || TextUtils.isEmpty(str)) {
            str = (String) this.f111347c;
        }
        if (TextUtils.isEmpty(str)) {
            Map emptyMap = Collections.emptyMap();
            Uri uri = Uri.EMPTY;
            bf.b.x(uri, "The uri must be set.");
            throw new MediaDrmCallbackException(new g7.i(uri, 0L, 1, null, emptyMap, 0L, -1L, null, 0, null), uri, a3.f100350g, 0L, new IllegalStateException("No license URL"));
        }
        HashMap hashMap = new HashMap();
        UUID uuid2 = a7.i.f1070e;
        hashMap.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : a7.i.f1068c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (((Map) this.f111348d)) {
            hashMap.putAll((Map) this.f111348d);
        }
        return a1.y(((g7.e) this.f111346b).a(), str, tVar.f111332a, hashMap);
    }

    public final byte[] d(u uVar) {
        return a1.y(((g7.e) this.f111346b).a(), uVar.f111335b + "&signedRequest=" + n0.q(uVar.f111334a), null, Collections.emptyMap());
    }

    public final void e(String str, String str2) {
        str.getClass();
        str2.getClass();
        synchronized (((Map) this.f111348d)) {
            ((Map) this.f111348d).put(str, str2);
        }
    }

    public z(StructuredFeedEmptyStateView emptyStateView, d0 pinalytics, yk1.v viewResources, boolean z13) {
        Intrinsics.checkNotNullParameter(emptyStateView, "emptyStateView");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        this.f111346b = emptyStateView;
        this.f111347c = pinalytics;
        this.f111348d = viewResources;
        this.f111345a = z13;
    }

    public z(String str, boolean z13, g7.l lVar) {
        bf.b.i((z13 && TextUtils.isEmpty(str)) ? false : true);
        this.f111346b = lVar;
        this.f111347c = str;
        this.f111345a = z13;
        this.f111348d = new HashMap();
    }

    public z(String boardName, boolean z13, z42.c cVar, int i13) {
        z42.f boardLayout = z42.f.DEFAULT;
        cVar = (i13 & 8) != 0 ? null : cVar;
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        Intrinsics.checkNotNullParameter(boardLayout, "boardLayout");
        this.f111347c = boardName;
        this.f111345a = z13;
        this.f111346b = boardLayout;
        this.f111348d = cVar;
    }
}
