package ha;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import androidx.lifecycle.n1;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final n1 f68336a = new n1();

    public static void a(Context context, o.a aVar, h1.b bVar) {
        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
        aVar.execute(new v.j(bVar, 11, (Object) null, 7));
    }

    public static void b(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static boolean c(AssetManager assetManager, String str, PackageInfo packageInfo, File file, String str2, o.a aVar, d dVar) {
        a aVar2 = new a(assetManager, aVar, dVar, str2, new File(new File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (!aVar2.c()) {
            return false;
        }
        a h10 = aVar2.h();
        h10.l();
        boolean m13 = h10.m();
        if (m13) {
            b(packageInfo, file);
        }
        return m13;
    }

    public static void d(Context context, o.a aVar, d dVar, boolean z13) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z14 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z13) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            boolean z15 = readLong == packageInfo.lastUpdateTime;
                            if (z15) {
                                dVar.i(2, null);
                            }
                            if (z15) {
                                Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                                l.c(context, false);
                                return;
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            if (c(assets, packageName, packageInfo, filesDir, name, aVar, dVar) && z13) {
                z14 = true;
            }
            l.c(context, z14);
        } catch (PackageManager.NameNotFoundException e13) {
            dVar.i(7, e13);
            l.c(context, false);
        }
    }

    public static void e(Context context, o.a aVar, h1.b bVar) {
        int i13 = 7;
        try {
            b(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            aVar.execute(new v.j(bVar, 10, (Object) null, i13));
        } catch (PackageManager.NameNotFoundException e13) {
            aVar.execute(new v.j(bVar, i13, e13, i13));
        }
    }
}
