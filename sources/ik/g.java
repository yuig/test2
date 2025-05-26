package ik;

import android.os.Build;
import android.util.Log;
import gi.m;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f72395b = Pattern.compile("lib/([^/]+)/(.*\\.so)$");

    /* renamed from: a, reason: collision with root package name */
    public final c f72396a;

    public g(c cVar) {
        this.f72396a = cVar;
    }

    public static void b(b bVar, d dVar) {
        ZipFile zipFile;
        try {
            zipFile = new ZipFile(bVar.f72388a);
            try {
                String str = bVar.f72389b;
                HashMap hashMap = new HashMap();
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry nextElement = entries.nextElement();
                    Matcher matcher = f72395b.matcher(nextElement.getName());
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        Log.d("SplitCompat", "NativeLibraryExtractor: split '" + str + "' has native library '" + group2 + "' for ABI '" + group + "'");
                        Set set = (Set) hashMap.get(group);
                        if (set == null) {
                            set = new HashSet();
                            hashMap.put(group, set);
                        }
                        set.add(new f(nextElement, group2));
                    }
                }
                HashMap hashMap2 = new HashMap();
                for (String str2 : Build.SUPPORTED_ABIS) {
                    if (hashMap.containsKey(str2)) {
                        Log.d("SplitCompat", "NativeLibraryExtractor: there are native libraries for supported ABI " + str2 + "; will use this ABI");
                        for (f fVar : (Set) hashMap.get(str2)) {
                            boolean containsKey = hashMap2.containsKey(fVar.f72393a);
                            String str3 = fVar.f72393a;
                            if (containsKey) {
                                Log.d("SplitCompat", "NativeLibraryExtractor: skipping library " + str3 + " for ABI " + str2 + "; already present for a better ABI");
                            } else {
                                hashMap2.put(str3, fVar);
                                Log.d("SplitCompat", "NativeLibraryExtractor: using library " + str3 + " for ABI " + str2);
                            }
                        }
                    } else {
                        Log.d("SplitCompat", "NativeLibraryExtractor: there are no native libraries for supported ABI " + str2);
                    }
                }
                dVar.c(zipFile, new HashSet(hashMap2.values()));
                zipFile.close();
            } catch (IOException e13) {
                e = e13;
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (IOException e14) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e14);
                    }
                }
                throw e;
            }
        } catch (IOException e15) {
            e = e15;
            zipFile = null;
        }
    }

    public final HashSet a() {
        Log.d("SplitCompat", "NativeLibraryExtractor: synchronizing native libraries");
        c cVar = this.f72396a;
        HashSet c13 = cVar.c();
        ArrayList arrayList = new ArrayList();
        File file = new File(cVar.i(), "native-libraries");
        c.g(file);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    arrayList.add(file2.getName());
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator it2 = c13.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Log.i("SplitCompat", "NativeLibraryExtractor: extracted split '" + str + "' has no corresponding split; deleting");
                    File file3 = new File(cVar.i(), "native-libraries");
                    c.g(file3);
                    File f13 = c.f(file3, str);
                    c.g(f13);
                    c.e(f13);
                    break;
                }
                if (((b) it2.next()).f72389b.equals(str)) {
                    break;
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it3 = c13.iterator();
        while (it3.hasNext()) {
            b bVar = (b) it3.next();
            HashSet hashSet2 = new HashSet();
            b(bVar, new m(this, hashSet2, bVar, 6));
            HashSet hashSet3 = new HashSet();
            File file4 = new File(cVar.i(), "native-libraries");
            c.g(file4);
            String str2 = bVar.f72389b;
            File f14 = c.f(file4, str2);
            c.g(f14);
            File[] listFiles2 = f14.listFiles();
            if (listFiles2 != null) {
                for (File file5 : listFiles2) {
                    if (file5.isFile()) {
                        hashSet3.add(file5);
                    }
                }
            }
            Iterator it4 = hashSet3.iterator();
            while (it4.hasNext()) {
                File file6 = (File) it4.next();
                if (!hashSet2.contains(file6)) {
                    String absolutePath = file6.getAbsolutePath();
                    String absolutePath2 = bVar.f72388a.getAbsolutePath();
                    StringBuilder w13 = a.a.w("NativeLibraryExtractor: file '", absolutePath, "' found in split '", str2, "' that is not in the split file '");
                    w13.append(absolutePath2);
                    w13.append("'; removing");
                    Log.i("SplitCompat", w13.toString());
                    File parentFile = file6.getParentFile().getParentFile();
                    File file7 = new File(cVar.i(), "native-libraries");
                    c.g(file7);
                    if (!parentFile.equals(file7)) {
                        throw new IllegalStateException("File to remove is not a native library");
                    }
                    c.e(file6);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }

    public final void c(b bVar, HashSet hashSet, e eVar) {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            String str = bVar.f72389b;
            String str2 = fVar.f72393a;
            c cVar = this.f72396a;
            cVar.getClass();
            File file = new File(cVar.i(), "native-libraries");
            c.g(file);
            File f13 = c.f(file, str);
            c.g(f13);
            File f14 = c.f(f13, str2);
            boolean z13 = false;
            if (f14.exists() && f14.length() == fVar.f72394b.getSize() && (!f14.canWrite())) {
                z13 = true;
            }
            eVar.f(fVar, f14, z13);
        }
    }
}
