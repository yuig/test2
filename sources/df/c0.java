package df;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f54724a;

    /* renamed from: b, reason: collision with root package name */
    public final String f54725b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f54726c;

    /* renamed from: d, reason: collision with root package name */
    public final int f54727d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumSet f54728e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f54729f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f54730g;

    /* renamed from: h, reason: collision with root package name */
    public final p f54731h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f54732i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f54733j;

    /* renamed from: k, reason: collision with root package name */
    public final JSONArray f54734k;

    /* renamed from: l, reason: collision with root package name */
    public final String f54735l;

    /* renamed from: m, reason: collision with root package name */
    public final String f54736m;

    /* renamed from: n, reason: collision with root package name */
    public final String f54737n;

    /* renamed from: o, reason: collision with root package name */
    public final String f54738o;

    public c0(boolean z13, String nuxContent, boolean z14, int i13, EnumSet smartLoginOptions, HashMap dialogConfigurations, boolean z15, p errorClassification, String smartLoginBookmarkIconURL, String smartLoginMenuIconURL, boolean z16, boolean z17, JSONArray jSONArray, String sdkUpdateMessage, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(nuxContent, "nuxContent");
        Intrinsics.checkNotNullParameter(smartLoginOptions, "smartLoginOptions");
        Intrinsics.checkNotNullParameter(dialogConfigurations, "dialogConfigurations");
        Intrinsics.checkNotNullParameter(errorClassification, "errorClassification");
        Intrinsics.checkNotNullParameter(smartLoginBookmarkIconURL, "smartLoginBookmarkIconURL");
        Intrinsics.checkNotNullParameter(smartLoginMenuIconURL, "smartLoginMenuIconURL");
        Intrinsics.checkNotNullParameter(sdkUpdateMessage, "sdkUpdateMessage");
        this.f54724a = z13;
        this.f54725b = nuxContent;
        this.f54726c = z14;
        this.f54727d = i13;
        this.f54728e = smartLoginOptions;
        this.f54730g = z15;
        this.f54731h = errorClassification;
        this.f54732i = z16;
        this.f54733j = z17;
        this.f54734k = jSONArray;
        this.f54735l = sdkUpdateMessage;
        this.f54736m = str;
        this.f54737n = str2;
        this.f54738o = str3;
    }
}
