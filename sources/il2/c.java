package il2;

import java.io.File;
import kotlin.io.AccessDeniedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c extends b {

    /* renamed from: b, reason: collision with root package name */
    public boolean f72560b;

    /* renamed from: c, reason: collision with root package name */
    public File[] f72561c;

    /* renamed from: d, reason: collision with root package name */
    public int f72562d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f72563e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f72564f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, File rootDir) {
        super(rootDir);
        Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        this.f72564f = gVar;
    }

    @Override // il2.h
    public final File a() {
        Function2 function2;
        boolean z13 = this.f72563e;
        g gVar = this.f72564f;
        File file = this.f72573a;
        if (!z13 && this.f72561c == null) {
            Function1 function1 = gVar.f72572d.f72576c;
            if (function1 != null && !((Boolean) function1.invoke(file)).booleanValue()) {
                return null;
            }
            File[] listFiles = file.listFiles();
            this.f72561c = listFiles;
            if (listFiles == null) {
                function2 = gVar.f72572d.f72578e;
                if (function2 != null) {
                    function2.invoke(file, new AccessDeniedException(this.f72573a, null, "Cannot list files in a directory", 2, null));
                }
                this.f72563e = true;
            }
        }
        File[] fileArr = this.f72561c;
        if (fileArr != null) {
            int i13 = this.f72562d;
            Intrinsics.f(fileArr);
            if (i13 < fileArr.length) {
                File[] fileArr2 = this.f72561c;
                Intrinsics.f(fileArr2);
                int i14 = this.f72562d;
                this.f72562d = i14 + 1;
                return fileArr2[i14];
            }
        }
        if (!this.f72560b) {
            this.f72560b = true;
            return file;
        }
        Function1 function12 = gVar.f72572d.f72577d;
        if (function12 != null) {
            function12.invoke(file);
        }
        return null;
    }
}
