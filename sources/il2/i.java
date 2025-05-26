package il2;

import java.io.File;
import java.util.Iterator;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;

/* loaded from: classes2.dex */
public final class i implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final File f72574a;

    /* renamed from: b, reason: collision with root package name */
    public final FileWalkDirection f72575b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f72576c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f72577d;

    /* renamed from: e, reason: collision with root package name */
    public final Function2 f72578e;

    /* renamed from: f, reason: collision with root package name */
    public final int f72579f;

    public i(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function12, Function2 function2, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        fileWalkDirection = (i14 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection;
        i13 = (i14 & 32) != 0 ? Integer.MAX_VALUE : i13;
        this.f72574a = file;
        this.f72575b = fileWalkDirection;
        this.f72576c = function1;
        this.f72577d = function12;
        this.f72578e = function2;
        this.f72579f = i13;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new g(this);
    }
}
