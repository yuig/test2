package androidx.core.content;

import a.a;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import d5.b;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f17923e = {"_display_name", "_size"};

    /* renamed from: f, reason: collision with root package name */
    public static final File f17924f = new File("/");

    /* renamed from: g, reason: collision with root package name */
    public static final HashMap f17925g = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public String f17927b;

    /* renamed from: c, reason: collision with root package name */
    public b f17928c;

    /* renamed from: a, reason: collision with root package name */
    public final Object f17926a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final int f17929d = 0;

    public static String a(String str) {
        return (str.length() <= 0 || str.charAt(str.length() + (-1)) != '/') ? str : str.substring(0, str.length() - 1);
    }

    public static b c(int i13, Context context, String str) {
        b bVar;
        HashMap hashMap = f17925g;
        synchronized (hashMap) {
            try {
                bVar = (b) hashMap.get(str);
                if (bVar == null) {
                    try {
                        try {
                            bVar = d(i13, context, str);
                            hashMap.put(str, bVar);
                        } catch (XmlPullParserException e13) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e13);
                        }
                    } catch (IOException e14) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e14);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return bVar;
    }

    public static b d(int i13, Context context, String str) {
        b bVar = new b(str);
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        if (resolveContentProvider == null) {
            throw new IllegalArgumentException(a.j("Couldn't find meta-data for provider with authority ", str));
        }
        if (resolveContentProvider.metaData == null && i13 != 0) {
            Bundle bundle = new Bundle(1);
            resolveContentProvider.metaData = bundle;
            bundle.putInt("android.support.FILE_PROVIDER_PATHS", i13);
        }
        XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (loadXmlMetaData == null) {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        while (true) {
            int next = loadXmlMetaData.next();
            if (next == 1) {
                return bVar;
            }
            if (next == 2) {
                String name = loadXmlMetaData.getName();
                File file = null;
                String attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    file = f17924f;
                } else if ("files-path".equals(name)) {
                    file = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    file = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    Object obj = d5.a.f53679a;
                    File[] externalFilesDirs = context.getExternalFilesDirs(null);
                    if (externalFilesDirs.length > 0) {
                        file = externalFilesDirs[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    Object obj2 = d5.a.f53679a;
                    File[] externalCacheDirs = context.getExternalCacheDirs();
                    if (externalCacheDirs.length > 0) {
                        file = externalCacheDirs[0];
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] externalMediaDirs = context.getExternalMediaDirs();
                    if (externalMediaDirs.length > 0) {
                        file = externalMediaDirs[0];
                    }
                }
                if (file == null) {
                    continue;
                } else {
                    String str2 = new String[]{attributeValue2}[0];
                    if (str2 != null) {
                        file = new File(file, str2);
                    }
                    if (TextUtils.isEmpty(attributeValue)) {
                        throw new IllegalArgumentException("Name must not be empty");
                    }
                    try {
                        bVar.f53681b.put(attributeValue, file.getCanonicalFile());
                    } catch (IOException e13) {
                        throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e13);
                    }
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(";")[0];
        synchronized (this.f17926a) {
            this.f17927b = str;
        }
        HashMap hashMap = f17925g;
        synchronized (hashMap) {
            hashMap.remove(str);
        }
    }

    public final b b() {
        b bVar;
        synchronized (this.f17926a) {
            try {
                if (this.f17927b == null) {
                    throw new NullPointerException("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                }
                if (this.f17928c == null) {
                    this.f17928c = c(this.f17929d, getContext(), this.f17927b);
                }
                bVar = this.f17928c;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return bVar;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return b().b(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        File b13 = b().b(uri);
        int lastIndexOf = b13.getName().lastIndexOf(46);
        if (lastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(b13.getName().substring(lastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        int i13;
        File b13 = b().b(uri);
        if ("r".equals(str)) {
            i13 = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i13 = 738197504;
        } else if ("wa".equals(str)) {
            i13 = 704643072;
        } else if ("rw".equals(str)) {
            i13 = 939524096;
        } else {
            if (!"rwt".equals(str)) {
                throw new IllegalArgumentException(a.j("Invalid mode: ", str));
            }
            i13 = 1006632960;
        }
        return ParcelFileDescriptor.open(b13, i13);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i13;
        File b13 = b().b(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f17923e;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i14 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i14] = "_display_name";
                i13 = i14 + 1;
                objArr[i14] = queryParameter == null ? b13.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i14] = "_size";
                i13 = i14 + 1;
                objArr[i14] = Long.valueOf(b13.length());
            }
            i14 = i13;
        }
        String[] strArr4 = new String[i14];
        System.arraycopy(strArr3, 0, strArr4, 0, i14);
        Object[] objArr2 = new Object[i14];
        System.arraycopy(objArr, 0, objArr2, 0, i14);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
