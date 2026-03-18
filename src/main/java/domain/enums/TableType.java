package domain.enums;

public enum TableType {
  TableType(6),
  FULL_RING(9);

  private final int tableType;

  TableType(int tableType) {
    this.tableType = tableType;
  }

  public int getTableType() {
    return tableType;
  }
}
