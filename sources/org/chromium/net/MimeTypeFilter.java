package org.chromium.net;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileFilter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public class MimeTypeFilter implements FileFilter {
    private boolean mAcceptAllMimeTypes;
    private boolean mAcceptDirectory;
    private MimeTypeMap mMimeTypeMap;
    private HashSet<String> mExtensions = new HashSet<>();
    private HashSet<String> mMimeTypes = new HashSet<>();
    private HashSet<String> mMimeSupertypes = new HashSet<>();

    public MimeTypeFilter(@NonNull List<String> list, boolean z13) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String lowerCase = it.next().trim().toLowerCase(Locale.US);
            if (lowerCase.startsWith(".")) {
                this.mExtensions.add(lowerCase.substring(1));
            } else if (lowerCase.equals("*/*")) {
                this.mAcceptAllMimeTypes = true;
            } else if (lowerCase.endsWith("/*")) {
                this.mMimeSupertypes.add(lowerCase.substring(0, lowerCase.length() - 2));
            } else if (lowerCase.contains("/")) {
                this.mMimeTypes.add(lowerCase);
            }
        }
        this.mMimeTypeMap = MimeTypeMap.getSingleton();
        this.mAcceptDirectory = z13;
    }

    @NonNull
    private static String getMimeSupertype(@NonNull String str) {
        return str.split("/", 2)[0];
    }

    private String getMimeTypeFromExtension(@NonNull String str) {
        String mimeTypeFromExtension = this.mMimeTypeMap.getMimeTypeFromExtension(str);
        if (mimeTypeFromExtension != null) {
            return mimeTypeFromExtension.toLowerCase(Locale.US);
        }
        return null;
    }

    public boolean accept(Uri uri, String str) {
        if (uri != null) {
            String lowerCase = MimeTypeMap.getFileExtensionFromUrl(uri.toString()).toLowerCase(Locale.US);
            if (this.mExtensions.contains(lowerCase)) {
                return true;
            }
            if (str == null) {
                str = getMimeTypeFromExtension(lowerCase);
            }
        }
        if (str != null) {
            return this.mAcceptAllMimeTypes || this.mMimeTypes.contains(str) || this.mMimeSupertypes.contains(getMimeSupertype(str));
        }
        return false;
    }

    @Override // java.io.FileFilter
    public boolean accept(@NonNull File file) {
        if (file.isDirectory()) {
            return this.mAcceptDirectory;
        }
        return accept(Uri.fromFile(file), null);
    }
}
