package gi2;

import J.N;
import a.cb;
import a.h5;
import a82.d;
import ak2.f;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.opengl.EGL14;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.Size;
import android.view.GestureDetector;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import bi1.a0;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookException;
import com.facebook.login.DeviceAuthDialog;
import com.google.android.gms.internal.measurement.x;
import com.pinterest.api.model.io;
import com.pinterest.api.model.jo;
import com.pinterest.api.model.ko;
import com.pinterest.api.model.lo;
import com.pinterest.api.model.no;
import com.pinterest.api.model.oo;
import com.pinterest.api.model.po;
import com.pinterest.api.model.qo;
import com.pinterest.api.model.ro;
import com.pinterest.api.model.ti;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import com.pinterest.design.brio.widget.empty.PinterestEmptyStateLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.ideaPinCreation.education.IdeaPinCreationEducationOnboardingView;
import com.pinterest.feature.search.results.view.n0;
import com.pinterest.feature.shopping.shoppingcomponents.productfilters.unifiedproductfilters.errorstate.ShoppingFilterEmptyStateView;
import com.pinterest.framework.multisection.datasource.pagedlist.k;
import com.pinterest.framework.screens.v;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.shuffles.scene.composer.p0;
import com.pinterest.ui.imageview.WebImageView;
import d91.l;
import df.c1;
import df.j1;
import eb2.g;
import ed1.m;
import ee1.e;
import ff0.j;
import h32.a4;
import h32.d4;
import h32.g0;
import h32.i0;
import h32.x3;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kh2.m0;
import kh2.w;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.coroutines.h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.z;
import le.o0;
import m60.f0;
import m60.r0;
import net.quikkly.android.utils.BitmapUtils;
import nx.d0;
import oe1.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pc.u0;
import ql2.s;
import r72.a2;
import sp2.i;
import uj2.q;
import v.j2;
import x02.z1;
import xe1.t;
import yq0.u;
import z32.f2;
import z40.y;
import zd1.e0;

/* loaded from: classes4.dex */
public final class b implements d, h, g, v, p0, n0, k, nc2.g, u, f {
    public b(Context context, b1.h listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        ViewConfiguration.get(context).getScaledTouchSlop();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        new GestureDetector(context, new c1.a(this, 0));
    }

    public static final void O(boolean z13) {
        if (!z13) {
            throw new FacebookException("Validation failed");
        }
    }

    public static final void P(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            throw new RuntimeException(a.a.D(str, ": EGL error: 0x", Integer.toHexString(eglGetError)));
        }
    }

    public static final ReentrantReadWriteLock Q(String str) {
        ReentrantReadWriteLock reentrantReadWriteLock;
        synchronized (z1.f131544c) {
            LinkedHashMap linkedHashMap = z1.f131548g;
            reentrantReadWriteLock = (ReentrantReadWriteLock) linkedHashMap.get(str);
            if (reentrantReadWriteLock == null) {
                reentrantReadWriteLock = new ReentrantReadWriteLock();
                linkedHashMap.put(str, reentrantReadWriteLock);
            }
        }
        return reentrantReadWriteLock;
    }

    public static final float R() {
        xk2.v vVar = IdeaPinCreationEducationOnboardingView.f46525h;
        return ((Number) IdeaPinCreationEducationOnboardingView.f46526i.getValue()).floatValue();
    }

    public static final q7.v S(JSONObject jSONObject) {
        String optString;
        int i13 = DeviceAuthDialog.B;
        JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length = jSONArray.length();
        if (length > 0) {
            int i14 = 0;
            while (true) {
                int i15 = i14 + 1;
                JSONObject optJSONObject = jSONArray.optJSONObject(i14);
                String permission = optJSONObject.optString("permission");
                Intrinsics.checkNotNullExpressionValue(permission, "permission");
                if (permission.length() != 0 && !Intrinsics.d(permission, "installed") && (optString = optJSONObject.optString("status")) != null) {
                    int hashCode = optString.hashCode();
                    if (hashCode != -1309235419) {
                        if (hashCode != 280295099) {
                            if (hashCode == 568196142 && optString.equals("declined")) {
                                arrayList2.add(permission);
                            }
                        } else if (optString.equals("granted")) {
                            arrayList.add(permission);
                        }
                    } else if (optString.equals("expired")) {
                        arrayList3.add(permission);
                    }
                }
                if (i15 >= length) {
                    break;
                }
                i14 = i15;
            }
        }
        return new q7.v(2, arrayList, arrayList2, arrayList3);
    }

    public static void U(PinterestEmptyStateLayout layout, Context context, e0 inlineFilterManager, uk1.d presenterPinalytics, q networkStateStream, yk1.v viewResources, ee1.f listener, d0 pinalytics, List list, int i13) {
        List list2 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : list;
        boolean z13 = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0;
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inlineFilterManager, "inlineFilterManager");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inlineFilterManager, "inlineFilterManager");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        ShoppingFilterEmptyStateView shoppingFilterEmptyStateView = new ShoppingFilterEmptyStateView(context);
        ee1.b bVar = dl2.b.A1(context) ? ee1.a.f58781b : ee1.a.f58780a;
        int i14 = bVar.f58782a;
        WebImageView webImageView = new WebImageView(shoppingFilterEmptyStateView.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i15 = shoppingFilterEmptyStateView.f48483a;
        layoutParams.topMargin = i15;
        webImageView.setLayoutParams(layoutParams);
        shoppingFilterEmptyStateView.setGravity(17);
        Context context2 = webImageView.getContext();
        Object obj = d5.a.f53679a;
        webImageView.setImageDrawable(context2.getDrawable(i14));
        shoppingFilterEmptyStateView.addView(webImageView);
        int i16 = bVar.f58783b;
        Resources resources = ((yk1.a) viewResources).f139224a;
        shoppingFilterEmptyStateView.b(resources.getString(i16), vn1.g.HEADING_700);
        String string = resources.getString(bVar.f58784c);
        if (string != null && shoppingFilterEmptyStateView.f48487e == null) {
            Context context3 = shoppingFilterEmptyStateView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            GestaltText gestaltText = new GestaltText(6, context3, (AttributeSet) null);
            gestaltText.i(new l(string, 16));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 17;
            layoutParams2.topMargin = i15;
            gestaltText.setLayoutParams(layoutParams2);
            gestaltText.setTextAlignment(4);
            shoppingFilterEmptyStateView.f48487e = gestaltText;
            shoppingFilterEmptyStateView.addView(gestaltText);
        }
        x xVar = new x(pinalytics, inlineFilterManager);
        e eVar = new e(presenterPinalytics, networkStateStream, inlineFilterManager, listener, xVar, list2, false);
        if (z13) {
            shoppingFilterEmptyStateView.a(eVar, xVar, false);
        }
        layout.h(shoppingFilterEmptyStateView, 48);
    }

    public static t V(oe1.b loggingData, vh story, Map iconRenderedMap, xe1.u storyNavigators) {
        Intrinsics.checkNotNullParameter(loggingData, "loggingData");
        Intrinsics.checkNotNullParameter(story, "story");
        Intrinsics.checkNotNullParameter(iconRenderedMap, "iconRenderedMap");
        Intrinsics.checkNotNullParameter(storyNavigators, "storyNavigators");
        re1.e O2 = c0.d.O2(story, storyNavigators.f134780h, new ee1.d(loggingData, 9));
        LinkedHashMap actionRenderedMap = new LinkedHashMap();
        Map map = c.f94273a;
        Intrinsics.checkNotNullParameter(loggingData, "loggingData");
        Intrinsics.checkNotNullParameter(iconRenderedMap, "iconRenderedMap");
        Intrinsics.checkNotNullParameter(actionRenderedMap, "actionRenderedMap");
        m mVar = new m(loggingData, iconRenderedMap, actionRenderedMap, 3);
        ti m13 = story.f42858p.m();
        f2 c13 = m13 != null ? m13.c() : null;
        ti m14 = story.f42858p.m();
        return new t(loggingData, storyNavigators, O2, mVar, null, false, false, false, 0.0f, false, null, c13, m14 != null ? m14.getShowSavedOverlay() : null, 2032);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01db A[LOOP:1: B:32:0x01d5->B:34:0x01db, LOOP_END] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static dc0.o W(com.pinterest.api.model.v7 r27, dc0.q r28, android.content.res.Resources r29) {
        /*
            Method dump skipped, instructions count: 966
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gi2.b.W(com.pinterest.api.model.v7, dc0.q, android.content.res.Resources):dc0.o");
    }

    public static void X(HashSet filesToKeep) {
        File dir;
        Intrinsics.checkNotNullParameter(filesToKeep, "filesToKeep");
        long time = new Date().getTime();
        long millis = TimeUnit.DAYS.toMillis(1L);
        if (j.f62103a) {
            dir = new File("sp_videos");
        } else {
            Context context = kb0.a.f79058b;
            dir = f0.j0().getDir("sp_videos", 0);
            Intrinsics.f(dir);
        }
        File[] listFiles = dir.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!filesToKeep.contains(file.getPath()) && time - file.lastModified() >= millis) {
                    String name = file.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    if (!z.p(name, "sp_video_export_", false)) {
                        String name2 = file.getName();
                        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                        if (!z.p(name2, "sp_image_to_video_", false)) {
                        }
                    }
                    file.delete();
                }
            }
        }
    }

    public static AccessToken Y(Bundle bundle, le.g gVar, String applicationId) {
        String string;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Date g03 = j1.g0(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
        ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        Date g04 = j1.g0(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
        if (string2 == null || string2.length() == 0 || (string = bundle.getString("com.facebook.platform.extra.USER_ID")) == null || string.length() == 0) {
            return null;
        }
        return new AccessToken(string2, applicationId, string, stringArrayList, null, null, gVar, g03, new Date(), g04, bundle.getString("graph_domain"));
    }

    public static AccessToken Z(Collection collection, Bundle bundle, le.g gVar, String applicationId) {
        Collection collection2;
        ArrayList arrayList;
        ArrayList arrayList2;
        List split$default;
        List split$default2;
        List split$default3;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Date g03 = j1.g0(bundle, "expires_in", new Date());
        String string = bundle.getString("access_token");
        if (string == null) {
            return null;
        }
        Date g04 = j1.g0(bundle, "data_access_expiration_time", new Date(0L));
        String string2 = bundle.getString("granted_scopes");
        if (string2 == null || string2.length() <= 0) {
            collection2 = collection;
        } else {
            split$default3 = StringsKt__StringsKt.split$default(string2, new String[]{","}, false, 0, 6, null);
            Object[] array = split$default3.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            collection2 = kotlin.collections.f0.d(Arrays.copyOf(strArr, strArr.length));
        }
        String string3 = bundle.getString("denied_scopes");
        if (string3 == null || string3.length() <= 0) {
            arrayList = null;
        } else {
            split$default2 = StringsKt__StringsKt.split$default(string3, new String[]{","}, false, 0, 6, null);
            Object[] array2 = split$default2.toArray(new String[0]);
            if (array2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr2 = (String[]) array2;
            arrayList = kotlin.collections.f0.d(Arrays.copyOf(strArr2, strArr2.length));
        }
        String string4 = bundle.getString("expired_scopes");
        if (string4 == null || string4.length() <= 0) {
            arrayList2 = null;
        } else {
            split$default = StringsKt__StringsKt.split$default(string4, new String[]{","}, false, 0, 6, null);
            Object[] array3 = split$default.toArray(new String[0]);
            if (array3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr3 = (String[]) array3;
            arrayList2 = kotlin.collections.f0.d(Arrays.copyOf(strArr3, strArr3.length));
        }
        if (j1.V0(string)) {
            return null;
        }
        return new AccessToken(string, applicationId, m0(bundle.getString("signed_request")), collection2, arrayList, arrayList2, gVar, g03, new Date(), g04, bundle.getString("graph_domain"));
    }

    public static AuthenticationToken a0(String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        String string = bundle.getString("id_token");
        if (string == null || string.length() == 0 || str == null || str.length() == 0) {
            return null;
        }
        try {
            return new AuthenticationToken(string, str);
        } catch (Exception e13) {
            throw new FacebookException(e13.getMessage(), e13);
        }
    }

    public static String c0() {
        String value = cb.g("toString(...)");
        int i13 = a2.f106437b;
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }

    public static i0 d0(a4 viewParameterType, d4 viewType, String uniqueScreenKey) {
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(viewParameterType, "viewParameterType");
        Intrinsics.checkNotNullParameter(uniqueScreenKey, "uniqueScreenKey");
        return new i0(viewType, viewParameterType, new x3(null, null, null, null, null, uniqueScreenKey, null, null, null, null, null, null, null, null, null, null, null), g0.TOOLBAR, null, null);
    }

    public static String e0(boolean z13) {
        File dir;
        String str = z13 ? "sp_image_to_video_" : "sp_video_export_";
        if (j.f62103a) {
            dir = new File("sp_videos");
        } else {
            Context context = kb0.a.f79058b;
            dir = f0.j0().getDir("sp_videos", 0);
            Intrinsics.f(dir);
        }
        return dir.getPath() + "/" + str + cp2.a.a(16) + ".mp4";
    }

    public static b f0() {
        return new b();
    }

    public static f1.a g0(i iVar) {
        return (f1.a) ((Drawable) iVar.f114928b);
    }

    public static ArrayList h0(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new lk0.a((z40.d0) it.next()));
        }
        return arrayList;
    }

    public static Rect i0(ImageView imageView) {
        Drawable drawable = imageView != null ? imageView.getDrawable() : null;
        if (drawable == null) {
            return new Rect();
        }
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            return new Rect();
        }
        RectF rectF = new RectF(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        imageView.getImageMatrix().mapRect(rectF);
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return rect;
    }

    public static int j0() {
        return df.i.Login.toRequestCode();
    }

    public static Size k0(float f13) {
        if (f13 == ((float) lo.f39845e.d())) {
            return new Size(720, 1280);
        }
        if (f13 == ((float) ro.f41632e.d())) {
            return new Size(780, 1170);
        }
        if (f13 == ((float) po.f41036e.d())) {
            return new Size(810, 1080);
        }
        if (f13 == ((float) jo.f39102e.d())) {
            return new Size(840, 1050);
        }
        if (f13 == ((float) oo.f40759e.d())) {
            return new Size(960, 960);
        }
        if (f13 == ((float) io.f38831e.d())) {
            return new Size(1050, 840);
        }
        if (f13 == ((float) ko.f39501e.d())) {
            return new Size(1080, 810);
        }
        if (f13 == ((float) qo.f41348e.d())) {
            return new Size(1170, 780);
        }
        if (f13 == ((float) no.f40447e.d())) {
            return new Size(1280, 720);
        }
        int sqrt = (int) Math.sqrt(921600 / f13);
        return new Size((int) (sqrt * f13), sqrt);
    }

    public static Uri l0(String action, Bundle bundle) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (Intrinsics.d(action, "oauth")) {
            return j1.u(c1.e(), "oauth/authorize", bundle);
        }
        return j1.u(c1.e(), le.v.e() + "/dialog/" + action, bundle);
    }

    public static String m0(String str) {
        List split$default;
        Object[] array;
        if (str == null || str.length() == 0) {
            throw new FacebookException("Authorization response does not contain the signed_request");
        }
        try {
            split$default = StringsKt__StringsKt.split$default(str, new String[]{"."}, false, 0, 6, null);
            array = split$default.toArray(new String[0]);
        } catch (UnsupportedEncodingException | JSONException unused) {
        }
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        String[] strArr = (String[]) array;
        if (strArr.length == 2) {
            byte[] data = Base64.decode(strArr[1], 0);
            Intrinsics.checkNotNullExpressionValue(data, "data");
            String string = new JSONObject(new String(data, Charsets.UTF_8)).getString("user_id");
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(\"user_id\")");
            return string;
        }
        throw new FacebookException("Failed to retrieve user_id from signed_request");
    }

    public static lk0.b n0(v7 board, List collaborators, List collaboratorsPending, boolean z13, String str) {
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(collaborators, "collaborators");
        Intrinsics.checkNotNullParameter(collaboratorsPending, "collaboratorsPending");
        boolean z14 = true;
        boolean z15 = kh2.d.D0(str, board) && !z13;
        if (!w.i0(board) && !kh2.d.e1(board)) {
            z14 = false;
        }
        ArrayList h03 = h0(collaborators);
        int intValue = (z14 ? board.J0() : 0).intValue();
        if (collaboratorsPending == null) {
            collaboratorsPending = new ArrayList();
        }
        lk0.b bVar = new lk0.b(z15, h03, intValue, collaboratorsPending);
        Intrinsics.checkNotNullExpressionValue(bVar, "build(...)");
        return bVar;
    }

    public static List o0(dl0.a viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        boolean z13 = viewModel.f55178f;
        if (!z13) {
            ArrayList arrayList = new ArrayList();
            boolean z14 = viewModel.f55181i;
            if (z14) {
                arrayList.add(cl0.a.Unfollow);
            } else if (!viewModel.f55175c && !z14 && (!viewModel.f55180h || z13)) {
                arrayList.add(cl0.a.Follow);
            }
            arrayList.add(cl0.a.Report);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(cl0.a.Edit);
        boolean z15 = viewModel.f55179g;
        boolean z16 = viewModel.f55184l;
        if (!z15) {
            if (!z13) {
                return q0.f80391a;
            }
            arrayList2.add(z16 ? cl0.a.Unarchive : cl0.a.Archive);
            return arrayList2;
        }
        if (viewModel.b() && !viewModel.f55187o) {
            arrayList2.add(cl0.a.Merge);
        }
        arrayList2.add(z16 ? cl0.a.Unarchive : cl0.a.Archive);
        return arrayList2;
    }

    public static void q0() {
        File[] listFiles;
        if (j1.O0()) {
            return;
        }
        File y13 = m0.y();
        if (y13 == null) {
            listFiles = new File[0];
        } else {
            listFiles = y13.listFiles(new df.f0(2));
            if (listFiles == null) {
                listFiles = new File[0];
            }
        }
        ArrayList arrayList = new ArrayList(listFiles.length);
        for (File file : listFiles) {
            arrayList.add(kh2.g0.i0(file));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ff.d) next).a()) {
                arrayList2.add(next);
            }
        }
        List x03 = CollectionsKt.x0(arrayList2, new j2(23));
        JSONArray jSONArray = new JSONArray();
        ql2.k it2 = s.q(0, Math.min(x03.size(), 5)).iterator();
        while (it2.f104109c) {
            jSONArray.put(x03.get(it2.b()));
        }
        m0.N0("crash_reports", jSONArray, new gf.b(x03, 1));
    }

    @Override // com.pinterest.shuffles.scene.composer.p0
    public void D(Collection items) {
        Intrinsics.checkNotNullParameter(items, "items");
    }

    @Override // yq0.u
    public void F(yq0.d0 viewHolder, RecyclerView parent, int i13) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(parent, "parent");
        int dimensionPixelSize = parent.getContext().getResources().getDimensionPixelSize(r0.margin_half);
        viewHolder.f19717a.setPaddingRelative(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.k
    public Object H(Object obj, Object obj2) {
        y oldItem = (y) obj;
        y newItem = (y) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return new e41.f(oldItem, newItem);
    }

    @Override // com.pinterest.framework.screens.v
    public void J(String nextScreen) {
        Intrinsics.checkNotNullParameter(nextScreen, "nextScreen");
    }

    public void T(String str, String str2) {
        N.M9XfPu17(str, str2);
    }

    @Override // eb2.g
    public int a() {
        return 0;
    }

    @Override // ak2.f
    public Object apply(Object obj) {
        q errors = (q) obj;
        Intrinsics.checkNotNullParameter(errors, "errors");
        q D = q.D(4);
        h5 h5Var = new h5(3);
        errors.getClass();
        q t13 = q.P(errors, D, h5Var).t(new ic1.a(26, new a0(this, 1)));
        Intrinsics.checkNotNullExpressionValue(t13, "flatMap(...)");
        return t13;
    }

    public synchronized void b0() {
        try {
            le.v vVar = le.v.f83104a;
            if (o0.b()) {
                q0();
            }
            if (hf.a.f68999c != null) {
                Log.w("hf.a", "Already enabled!");
                return;
            }
            hf.a aVar = new hf.a(Thread.getDefaultUncaughtExceptionHandler());
            hf.a.f68999c = aVar;
            Thread.setDefaultUncaughtExceptionHandler(aVar);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.k
    public Object f(pc.h response) {
        u40.i0 i0Var;
        Intrinsics.checkNotNullParameter(response, "response");
        pc.n0 n0Var = response.f99563c;
        u40.o0 o0Var = n0Var instanceof u40.o0 ? (u40.o0) n0Var : null;
        if (o0Var == null || (i0Var = o0Var.f120410a) == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(i0Var, "<this>");
        if (i0Var instanceof u40.n0) {
            return (u40.n0) i0Var;
        }
        return null;
    }

    @Override // com.pinterest.framework.screens.v
    public void g() {
    }

    @Override // com.pinterest.framework.screens.v
    public void h(String nextTabScreen) {
        Intrinsics.checkNotNullParameter(nextTabScreen, "nextTabScreen");
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.k
    public u0 q(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        return new u40.p0(id3);
    }

    public void r0(i iVar) {
        if (!((CardView) iVar.f114929c).f17053a) {
            iVar.Z(0, 0, 0, 0);
            return;
        }
        Object obj = iVar.f114928b;
        float f13 = ((f1.a) ((Drawable) obj)).f60763e;
        float f14 = ((f1.a) ((Drawable) obj)).f60759a;
        int ceil = (int) Math.ceil(f1.b.a(f13, f14, ((CardView) r0).f17054b));
        int ceil2 = (int) Math.ceil(f1.b.b(f13, f14, ((CardView) iVar.f114929c).f17054b));
        iVar.Z(ceil, ceil2, ceil, ceil2);
    }

    public b(double d2, double d13) {
        new AtomicLong(System.nanoTime() - ((long) (d13 / (d2 / 1.0E9d))));
    }
}
