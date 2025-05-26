package ps0;

import android.app.Activity;
import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import bk1.a2;
import bk1.l1;
import com.pinterest.api.model.f30;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import ni1.n2;
import ni1.u0;
import ni1.y2;
import so.nd;
import so.zc;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f101282a;

    public /* synthetic */ m(int i13) {
        this.f101282a = i13;
    }

    public static final boolean a(l82.e eVar) {
        m mVar = n2.f90745n;
        List list = ((u0) eVar.f82218a).f90820n.f59328a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((wi1.b) it.next()) instanceof xi1.a) {
                return true;
            }
        }
        return false;
    }

    public static void b(l82.e eVar, aj1.a... piece) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(piece, "piece");
        eVar.f(new u00.e(piece, 24));
    }

    public static boolean c(Bundle one, Bundle two) {
        Intrinsics.checkNotNullParameter(one, "one");
        Intrinsics.checkNotNullParameter(two, "two");
        if (one.size() != two.size()) {
            return false;
        }
        Set<String> keySet = one.keySet();
        Set<String> keySet2 = two.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet2, "keySet(...)");
        if (!keySet.containsAll(keySet2)) {
            return false;
        }
        for (String str : one.keySet()) {
            Object obj = one.get(str);
            Object obj2 = two.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle)) {
                if (!c((Bundle) obj, (Bundle) obj2)) {
                    return false;
                }
            } else if (!Intrinsics.d(obj, obj2)) {
                return false;
            }
        }
        return true;
    }

    public static ti1.a d(wa2.m pinFeatureConfig) {
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        wa2.g0 g0Var = pinFeatureConfig.f128851b0;
        return new ti1.a(g0Var != null ? g0Var.f128725g : null, pinFeatureConfig.f128870l, pinFeatureConfig.N, pinFeatureConfig.O, pinFeatureConfig.f128873m0);
    }

    public static String f(Activity activity, Uri uri, String str, String[] strArr) {
        Cursor cursor = null;
        try {
            Cursor query = activity.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndexOrThrow("_data"));
                        query.close();
                        return string;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static String g(Activity context, Uri uri) {
        List split$default;
        List split$default2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (Intrinsics.d("com.android.externalstorage.documents", uri.getAuthority())) {
                String documentId = DocumentsContract.getDocumentId(uri);
                Intrinsics.checkNotNullExpressionValue(documentId, "getDocumentId(...)");
                split$default2 = StringsKt__StringsKt.split$default(documentId, new String[]{":"}, false, 0, 6, null);
                String[] strArr = (String[]) split$default2.toArray(new String[0]);
                if (kotlin.text.z.i("primary", strArr[0], true)) {
                    return a.a.D(Environment.getExternalStorageDirectory().toString(), "/", strArr[1]);
                }
            } else {
                if (Intrinsics.d("com.android.providers.downloads.documents", uri.getAuthority())) {
                    String documentId2 = DocumentsContract.getDocumentId(uri);
                    Intrinsics.checkNotNullExpressionValue(documentId2, "getDocumentId(...)");
                    Uri parse = Uri.parse("content://downloads/public_downloads");
                    Long valueOf = Long.valueOf(documentId2);
                    Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
                    Uri withAppendedId = ContentUris.withAppendedId(parse, valueOf.longValue());
                    Intrinsics.checkNotNullExpressionValue(withAppendedId, "withAppendedId(...)");
                    return f(context, withAppendedId, null, null);
                }
                if (Intrinsics.d("com.android.providers.media.documents", uri.getAuthority())) {
                    String documentId3 = DocumentsContract.getDocumentId(uri);
                    Intrinsics.checkNotNullExpressionValue(documentId3, "getDocumentId(...)");
                    split$default = StringsKt__StringsKt.split$default(documentId3, new String[]{":"}, false, 0, 6, null);
                    String[] strArr2 = (String[]) split$default.toArray(new String[0]);
                    String str = strArr2[0];
                    Uri EXTERNAL_CONTENT_URI = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    Intrinsics.checkNotNullExpressionValue(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
                    if (Intrinsics.d("image", str)) {
                        EXTERNAL_CONTENT_URI = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                        Intrinsics.checkNotNullExpressionValue(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
                    } else if (Intrinsics.d("video", str)) {
                        Intrinsics.checkNotNullExpressionValue(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
                    }
                    return f(context, EXTERNAL_CONTENT_URI, "_id=?", new String[]{strArr2[1]});
                }
            }
        } else {
            if (kotlin.text.z.i("content", uri.getScheme(), true)) {
                return f(context, uri, null, null);
            }
            if (kotlin.text.z.i("file", uri.getScheme(), true)) {
                return uri.getPath();
            }
        }
        return null;
    }

    public static List h(String str) {
        List split$default;
        if (str == null || str.length() == 0) {
            return kotlin.collections.q0.f80391a;
        }
        split$default = StringsKt__StringsKt.split$default(str, new String[]{"/"}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : split$default) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static HashMap i(URI uri) {
        List<String> split$default;
        List split$default2;
        List split$default3;
        HashMap hashMap = new HashMap();
        String query = uri.getQuery();
        Intrinsics.checkNotNullExpressionValue(query, "getQuery(...)");
        split$default = StringsKt__StringsKt.split$default(query, new String[]{"&"}, false, 0, 6, null);
        for (String str : split$default) {
            split$default2 = StringsKt__StringsKt.split$default(str, new String[]{"="}, false, 0, 6, null);
            Object obj = split$default2.get(0);
            split$default3 = StringsKt__StringsKt.split$default(str, new String[]{"="}, false, 0, 6, null);
            hashMap.put(obj, split$default3.get(1));
        }
        return hashMap;
    }

    public static String j(f30 f30Var) {
        URI uri;
        String host;
        String str;
        if (f30Var == null) {
            return null;
        }
        try {
            String s53 = f30Var.s5();
            if (s53 == null || s53.length() == 0 || (host = (uri = new URI(s53)).getHost()) == null) {
                return null;
            }
            if (kotlin.text.z.p(host, "www.", false)) {
                host = host.substring(4);
                Intrinsics.checkNotNullExpressionValue(host, "substring(...)");
            }
            if (!"youtube.com".equals(host) && !"m.youtube.com".equals(host) && !"music.youtube.com".equals(host)) {
                if (!"youtu.be".equals(host)) {
                    return null;
                }
                List h10 = h(uri.getPath());
                if (h10.size() != 1) {
                    return null;
                }
                str = (String) CollectionsKt.firstOrNull(h10);
                return str;
            }
            List h13 = h(uri.getPath());
            if ("shorts".equals(CollectionsKt.firstOrNull(h13)) && h13.size() == 2) {
                str = (String) h13.get(1);
            } else {
                if (!"watch".equals(CollectionsKt.firstOrNull(h13))) {
                    return null;
                }
                str = (String) i(uri).get("v");
            }
            return str;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean k(l82.e eVar, es.h adsCommonDisplay) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        fk1.w wVar = (fk1.w) eVar.f82219b;
        return ((es.v) adsCommonDisplay).C(wVar.f62380a, wVar.f62383d.C, new defpackage.d(18, eVar));
    }

    public static boolean l(l82.e eVar, es.h adsCommonDisplay, wa2.m pinFeatureConfig) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        return ((es.v) adsCommonDisplay).Z(((fk1.w) eVar.f82219b).f62380a, pinFeatureConfig.O, pinFeatureConfig.N);
    }

    public static boolean m(l82.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        eVar.a(new l1(zc.f114750a));
        return ((a2) eVar.f82219b).f23158d.f90855g0;
    }

    public final fm1.c e() {
        switch (this.f101282a) {
            case 22:
                return GestaltIconButton.D;
            default:
                return vn1.h.f126280f;
        }
    }

    public final boolean n(l82.e eVar) {
        nd ndVar = nd.f113572a;
        switch (this.f101282a) {
            case 7:
                eVar.a(new ni1.o(ndVar));
                return ((y2) eVar.f82219b).f90907e.f90850e;
            default:
                Intrinsics.checkNotNullParameter(eVar, "<this>");
                eVar.a(new fk1.k(ndVar));
                return ((fk1.w) eVar.f82219b).f62383d.f90850e;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i13, int i14) {
        this(0);
        this.f101282a = i13;
        switch (i13) {
            case 1:
                this(1);
                break;
            case 2:
            case 6:
            case 27:
            default:
                break;
            case 3:
                this(3);
                break;
            case 4:
                this(4);
                break;
            case 5:
                this(5);
                break;
            case 7:
                this(7);
                break;
            case 8:
                this(8);
                break;
            case 9:
                this(9);
                break;
            case 10:
                this(10);
                break;
            case 11:
                this(11);
                break;
            case 12:
                this(12);
                break;
            case 13:
                this(13);
                break;
            case 14:
                this(14);
                break;
            case 15:
                this(15);
                break;
            case 16:
                this(16);
                break;
            case 17:
                this(17);
                break;
            case 18:
                this(18);
                break;
            case 19:
                this(19);
                break;
            case 20:
                this(20);
                break;
            case 21:
                this(21);
                break;
            case 22:
                this(22);
                break;
            case 23:
                this(23);
                break;
            case 24:
                this(24);
                break;
            case 25:
                this(25);
                break;
            case 26:
                this(26);
                break;
            case 28:
                this(28);
                break;
            case 29:
                this(29);
                break;
        }
    }
}
