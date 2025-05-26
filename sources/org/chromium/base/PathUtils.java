package org.chromium.base;

import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import dp2.e;
import dp2.j;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.base.annotations.CalledByNative;
import so.a;

/* loaded from: classes4.dex */
public abstract class PathUtils {
    static {
        new AtomicBoolean();
    }

    public static String[] a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (file != null && !TextUtils.isEmpty(file.getAbsolutePath())) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @NonNull
    @CalledByNative
    public static String[] getAllPrivateDownloadsDirectories() {
        List arrayList = new ArrayList();
        j d2 = j.d();
        try {
            File[] externalFilesDirs = a.f113317a.getExternalFilesDirs(Environment.DIRECTORY_DOWNLOADS);
            if (externalFilesDirs != null) {
                arrayList = Arrays.asList(externalFilesDirs);
            }
            d2.close();
            return a(arrayList);
        } catch (Throwable th3) {
            try {
                d2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @CalledByNative
    public static String getCacheDirectory() {
        throw null;
    }

    @CalledByNative
    public static String getDataDirectory() {
        throw null;
    }

    @NonNull
    @CalledByNative
    public static String getDownloadsDirectory() {
        j c13 = j.c();
        try {
            if (Build.VERSION.SDK_INT < 29) {
                String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
                c13.close();
                return path;
            }
            String[] allPrivateDownloadsDirectories = getAllPrivateDownloadsDirectories();
            String str = allPrivateDownloadsDirectories.length == 0 ? "" : allPrivateDownloadsDirectories[0];
            c13.close();
            return str;
        } catch (Throwable th3) {
            try {
                c13.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @NonNull
    @CalledByNative
    public static String[] getExternalDownloadVolumesNames() {
        Set<String> externalVolumeNames;
        StorageVolume storageVolume;
        File directory;
        ArrayList arrayList = new ArrayList();
        externalVolumeNames = MediaStore.getExternalVolumeNames(a.f113317a);
        for (String str : externalVolumeNames) {
            if (!TextUtils.isEmpty(str) && !str.contains("external_primary")) {
                storageVolume = ((StorageManager) a.f113317a.getSystemService(StorageManager.class)).getStorageVolume(MediaStore.Files.getContentUri(str));
                directory = storageVolume.getDirectory();
                File file = new File(directory, Environment.DIRECTORY_DOWNLOADS);
                if (!file.isDirectory()) {
                    e.i("PathUtils", "Download dir missing: %s, parent dir:%s, isDirectory:%s", file.getAbsolutePath(), directory.getAbsolutePath(), Boolean.valueOf(directory.isDirectory()));
                }
                arrayList.add(file);
            }
        }
        return a(arrayList);
    }

    @CalledByNative
    public static String getExternalStorageDirectory() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    @CalledByNative
    public static String getNativeLibraryDirectory() {
        ApplicationInfo applicationInfo = a.f113317a.getApplicationInfo();
        int i13 = applicationInfo.flags;
        return ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 || (i13 & 1) == 0) ? applicationInfo.nativeLibraryDir : "/system/lib/";
    }

    @CalledByNative
    public static String getThumbnailCacheDirectory() {
        throw null;
    }
}
