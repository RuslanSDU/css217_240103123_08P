public class Task03Adapter implements IModernDirectory {

    private final LegacyStudentDirectory legacy;

    public Task03Adapter(LegacyStudentDirectory legacy) {
        this.legacy = legacy;
    }

    public String getStudent(int zeroBasedIndex) {
        if (zeroBasedIndex < 0 || zeroBasedIndex >= size()) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + zeroBasedIndex);
        }

        return legacy.getStudentAt(zeroBasedIndex + 1);
    }

    public int size() {
        return legacy.totalEntries();
    }
}