package kd;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public final class e extends ByteArrayOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f79214a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, int i13) {
        super(i13);
        this.f79214a = fVar;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int i13 = ((ByteArrayOutputStream) this).count;
        if (i13 > 0 && ((ByteArrayOutputStream) this).buf[i13 - 1] == 13) {
            i13--;
        }
        try {
            return new String(((ByteArrayOutputStream) this).buf, 0, i13, this.f79214a.f79216b.name());
        } catch (UnsupportedEncodingException e13) {
            throw new AssertionError(e13);
        }
    }
}
