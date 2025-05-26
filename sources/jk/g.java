package jk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public final class g implements kk.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76335a;

    /* renamed from: b, reason: collision with root package name */
    public final kk.o f76336b;

    public /* synthetic */ g(kk.o oVar, int i13) {
        this.f76335a = i13;
        this.f76336b = oVar;
    }

    @Override // kk.o
    public final Object zza() {
        mk.c cVar;
        String string;
        int i13 = this.f76335a;
        kk.o oVar = this.f76336b;
        switch (i13) {
            case 0:
                File file = (File) oVar.zza();
                if (file == null) {
                    return null;
                }
                fi.b bVar = mk.b.f87300c;
                File file2 = new File(file, "local_testing_config.xml");
                if (file2.exists()) {
                    try {
                        FileReader fileReader = new FileReader(file2);
                        try {
                            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                            newPullParser.setInput(fileReader);
                            mk.b bVar2 = new mk.b(newPullParser);
                            bVar2.a("local-testing-config", new mk.h(bVar2, 2));
                            mk.c x13 = bVar2.f87302b.x();
                            fileReader.close();
                            return x13;
                        } catch (Throwable th3) {
                            try {
                                fileReader.close();
                            } catch (Throwable th4) {
                                try {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                                } catch (Exception unused) {
                                }
                            }
                            throw th3;
                        }
                    } catch (IOException | RuntimeException | XmlPullParserException e13) {
                        mk.b.f87300c.h("%s can not be parsed, using default. Error: %s", "local_testing_config.xml", e13.getMessage());
                        cVar = mk.c.f87303c;
                    }
                } else {
                    cVar = mk.c.f87303c;
                }
                return cVar;
            case 1:
                Context context = ((f) oVar).f76334a.f67746a;
                if (context == null) {
                    throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                try {
                    Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN).metaData;
                    if (bundle == null || (string = bundle.getString("local_testing_dir")) == null) {
                        return null;
                    }
                    return new File(context.getExternalFilesDir(null), string);
                } catch (PackageManager.NameNotFoundException unused2) {
                    return null;
                }
            case 2:
                Context context2 = ((f) oVar).f76334a.f67746a;
                if (context2 != null) {
                    return new l(context2, context2.getPackageName());
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            case 3:
                Context context3 = ((f) oVar).f76334a.f67746a;
                if (context3 != null) {
                    return new m(context3);
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                Context context4 = ((f) oVar).f76334a.f67746a;
                if (context4 != null) {
                    return new u(context4);
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
