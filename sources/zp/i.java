package zp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Activity f142421i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ rw0.a f142422j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j f142423k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ pw0.x f142424l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ nx.d0 f142425m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f142426n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f142427o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ou1.e f142428p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Bundle f142429q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f142430r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f142431s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Activity activity, rw0.a aVar, j jVar, pw0.x xVar, nx.d0 d0Var, Context context, int i13, ou1.e eVar, Bundle bundle, String str, int i14) {
        super(0);
        this.f142421i = activity;
        this.f142422j = aVar;
        this.f142423k = jVar;
        this.f142424l = xVar;
        this.f142425m = d0Var;
        this.f142426n = context;
        this.f142427o = i13;
        this.f142428p = eVar;
        this.f142429q = bundle;
        this.f142430r = str;
        this.f142431s = i14;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        Activity activity = this.f142421i;
        rw0.a aVar = this.f142422j;
        Bundle G = gh0.b.G(activity, aVar);
        Intent b13 = this.f142423k.f142432a.b(activity, lu1.a.MEDIA_GALLERY_ACTIVITY);
        pw0.x xVar = this.f142424l;
        b13.putExtra("com.pinterest.EXTRA_ENABLE_VIDEO_UPLOAD", j.a(xVar));
        b13.putExtra("com.pinterest.EXTRA_MEDIA_GALLERY_TYPE", xVar.name());
        b13.putExtra("com.pinterest.EXTRA_MEDIA_GALLERY_MAX_SELECTED_ITEMS", this.f142427o);
        b13.putExtra("com.pinterest.EXTRA_MEDIA_GALLERY_TRANSITION_TYPE", aVar);
        ou1.e eVar = this.f142428p;
        if (eVar != null) {
            b13.putExtra("com.pinterest.EXTRA_STORY_PIN_CREATION_ENTRY_TYPE", eVar.getValue());
        }
        Bundle bundle = this.f142429q;
        if (bundle != null) {
            b13.putExtra("com.pinterest.EXTRA_MEDIA_GALLERY_EXTRA_BUNDLE", bundle);
        }
        if (Intrinsics.d(this.f142430r, "image")) {
            b13.putExtra("com.pinterest.REMOVE_PROFILE_COVER", true);
        }
        if (bundle != null && (string5 = bundle.getString("com.pinterest.EXTRA_COMMENT_ID")) != null) {
            b13.putExtra("com.pinterest.EXTRA_COMMENT_ID", string5);
        }
        if (bundle != null && (string4 = bundle.getString("com.pinterest.EXTRA_COMMENT_AUTHOR_NAME")) != null) {
            b13.putExtra("com.pinterest.EXTRA_COMMENT_AUTHOR_NAME", string4);
        }
        if (bundle != null && (string3 = bundle.getString("com.pinterest.EXTRA_COMMENT_TEXT")) != null) {
            b13.putExtra("com.pinterest.EXTRA_COMMENT_TEXT", string3);
        }
        if (bundle != null && (string2 = bundle.getString("com.pinterest.EXTRA_COMMENT_PIN_ID")) != null) {
            b13.putExtra("com.pinterest.EXTRA_COMMENT_PIN_ID", string2);
        }
        if (bundle != null && (string = bundle.getString("com.pinterest.EXTRA_COMMENT_PIN_THUMBNAIL_PATH")) != null) {
            b13.putExtra("com.pinterest.EXTRA_COMMENT_PIN_THUMBNAIL_PATH", string);
        }
        b13.putExtra("com.pinterest.EXTRA_PIN_SCHEDULED_TIME_SECONDS", this.f142431s);
        switch (h.f142420a[xVar.ordinal()]) {
            case 1:
                activity.startActivityForResult(b13, 900, G);
                break;
            case 2:
                activity.startActivityForResult(b13, 975, G);
                break;
            case 3:
                activity.startActivityForResult(b13, 950, G);
                break;
            case 4:
                activity.startActivityForResult(b13, 952, G);
                break;
            case 5:
                activity.startActivityForResult(b13, 982, G);
                break;
            case 6:
                nx.d0 d0Var = this.f142425m;
                if (d0Var != null) {
                    nx.d0.v(d0Var, h32.f1.PHOTO_COMMENT_PICKER_VIEWED, null, false, 12);
                }
                Intent intent = new Intent(Build.VERSION.SDK_INT >= 33 ? "android.provider.action.PICK_IMAGES" : "android.intent.action.PICK");
                intent.setType("image/*");
                activity.startActivityForResult(intent, 970);
                break;
            default:
                this.f142426n.startActivity(b13, G);
                break;
        }
        return Unit.f80348a;
    }
}
