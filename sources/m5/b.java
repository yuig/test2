package m5;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import g1.r;
import i2.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final r f85836a = new r(2);

    /* renamed from: b, reason: collision with root package name */
    public static final t f85837b = new t(2);

    public static ck2.a a(Context context, List list) {
        Trace.beginSection(tb.f.k0("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i13 = 0; i13 < list.size(); i13++) {
                c cVar = (c) list.get(i13);
                ProviderInfo b13 = b(context.getPackageManager(), cVar, context.getResources());
                if (b13 == null) {
                    ck2.a aVar = new ck2.a();
                    aVar.f27913a = 1;
                    aVar.f27914b = Collections.singletonList(null);
                    Trace.endSection();
                    return aVar;
                }
                arrayList.add(c(context, cVar, b13.authority));
            }
            ck2.a aVar2 = new ck2.a();
            aVar2.f27913a = 0;
            aVar2.f27914b = arrayList;
            Trace.endSection();
            return aVar2;
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    public static ProviderInfo b(PackageManager packageManager, c cVar, Resources resources) {
        Trace.beginSection(tb.f.k0("FontProvider.getProvider"));
        try {
            List list = cVar.f85841d;
            String str = cVar.f85838a;
            String str2 = cVar.f85839b;
            if (list == null) {
                list = com.bumptech.glide.d.r0(cVar.a(), resources);
            }
            a aVar = new a();
            aVar.f85833a = str;
            aVar.f85834b = str2;
            aVar.f85835c = list;
            r rVar = f85836a;
            ProviderInfo providerInfo = (ProviderInfo) rVar.c(aVar);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!resolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            t tVar = f85837b;
            Collections.sort(arrayList, tVar);
            for (int i13 = 0; i13 < list.size(); i13++) {
                ArrayList arrayList2 = new ArrayList((Collection) list.get(i13));
                Collections.sort(arrayList2, tVar);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i14), (byte[]) arrayList2.get(i14))) {
                            break;
                        }
                    }
                    rVar.d(aVar, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static g[] c(Context context, c cVar, String str) {
        ArrayList arrayList;
        int i13;
        ArrayList arrayList2;
        Trace.beginSection(tb.f.k0("FontProvider.query"));
        try {
            ArrayList arrayList3 = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.beginSection(tb.f.k0("ContentQueryWrapper.query"));
                try {
                    String[] strArr2 = {cVar.f85840c};
                    if (acquireUnstableContentProviderClient == null) {
                        arrayList = arrayList3;
                        i13 = 1;
                    } else {
                        arrayList = arrayList3;
                        i13 = 1;
                        try {
                            cursor = acquireUnstableContentProviderClient.query(build, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e13) {
                            Log.w("FontsProvider", "Unable to query the content provider", e13);
                        }
                    }
                    Cursor cursor2 = cursor;
                    try {
                        if (cursor2 == null || cursor2.getCount() <= 0) {
                            arrayList2 = arrayList;
                        } else {
                            int columnIndex = cursor2.getColumnIndex("result_code");
                            ArrayList arrayList4 = new ArrayList();
                            int columnIndex2 = cursor2.getColumnIndex("_id");
                            int columnIndex3 = cursor2.getColumnIndex("file_id");
                            int columnIndex4 = cursor2.getColumnIndex("font_ttc_index");
                            int columnIndex5 = cursor2.getColumnIndex("font_weight");
                            int columnIndex6 = cursor2.getColumnIndex("font_italic");
                            while (cursor2.moveToNext()) {
                                arrayList4.add(new g(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor2.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor2.getLong(columnIndex3)), columnIndex4 != -1 ? cursor2.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor2.getInt(columnIndex5) : 400, (columnIndex6 == -1 || cursor2.getInt(columnIndex6) != i13) ? 0 : i13, columnIndex != -1 ? cursor2.getInt(columnIndex) : 0));
                            }
                            arrayList2 = arrayList4;
                        }
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        if (acquireUnstableContentProviderClient != null) {
                            acquireUnstableContentProviderClient.close();
                        }
                        return (g[]) arrayList2.toArray(new g[0]);
                    } catch (Throwable th3) {
                        th = th3;
                        cursor = cursor2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (acquireUnstableContentProviderClient != null) {
                            acquireUnstableContentProviderClient.close();
                        }
                        throw th;
                    }
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            throw th5;
        }
    }
}
