class ProjectTest {
    public static void main(String[] args) {
        Project project1 = new Project();
        // Project project2 = new Project();
        project1.setName("xinya");
        project1.setDescription("Sale a pencil");
        String project1Name = project1.getName();
        String projcet1Description = project1.getDescription();
        System.out.println(project1Name+" : "+ projcet1Description);
    }
}
